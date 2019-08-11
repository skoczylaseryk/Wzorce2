package com.itersive.sda.patterns.behavioral.command;

public class TextFile {
    private String name;

    public TextFile(String name) {
        this.name = name;
    }

    public String open() {
        return name + " opened.";
    }

    public String save() {
        return name + " saved";
    }
}
