package com.itersive.sda.patterns.behavioral.command;

import java.util.LinkedList;
import java.util.List;

public class TextFileOperationExecutor {

    private final List<TextFileOperation> textFileOperations = new LinkedList<>();

    public String executeOperation(TextFileOperation operation) {
        textFileOperations.add(operation);
        return operation.execute();
    }
}
