package com.itersive.sda.patterns.behavioral.command;

public class Client {
    public static void main(String[] args) {
        TextFileOperationExecutor executor = new TextFileOperationExecutor();
        executor.executeOperation(new OpenTextFileOperation(new TextFile("file1")));
        executor.executeOperation(new SaveTextFileOperation(new TextFile("file2")));

        // OR

        TextFile file = new TextFile("file3");
        executor.executeOperation(file::open);
        executor.executeOperation(file::save);

        // OR

        executor.executeOperation(() -> "Opening new file4");
    }
}
