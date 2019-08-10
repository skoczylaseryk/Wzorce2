package com.itersive.sda.patterns.structural.proxy;

public class LinuxExecutor implements Executor {
    @Override
    public void runCommand(String command) throws Exception {
        Runtime.getRuntime().exec(command);
    }
}
