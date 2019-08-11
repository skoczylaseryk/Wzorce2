package com.itersive.sda.patterns.behavioral.command;

public class SaveTextFileOperation implements TextFileOperation {

    private TextFile textfile;

    public SaveTextFileOperation(TextFile file) {
        textfile = file;
    }

    @Override
    public String execute() {
        return textfile.save();
    }
}
