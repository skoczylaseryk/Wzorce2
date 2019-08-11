package com.itersive.sda.patterns.behavioral.command;

public class OpenTextFileOperation implements TextFileOperation {

    private TextFile textfile;

    public OpenTextFileOperation(TextFile file) {
        textfile = file;
    }

    @Override
    public String execute() {
        return textfile.open();
    }
}
