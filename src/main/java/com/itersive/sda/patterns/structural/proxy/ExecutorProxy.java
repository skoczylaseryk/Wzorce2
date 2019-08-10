package com.itersive.sda.patterns.structural.proxy;

public class ExecutorProxy implements Executor {
    private boolean isAdmin;
    private Executor executor;

    public ExecutorProxy(boolean isAdmin) {
        this.isAdmin = isAdmin;
        this.executor = new LinuxExecutor();
    }

    @Override
    public void runCommand(String command) throws Exception {
        if (command.trim().startsWith("rm")) {
            if (isAdmin) {
                executor.runCommand(command);
            } else {
                throw new Exception("Only admin can remove files.");
            }
        } else {
            executor.runCommand(command);
        }
    }
}
