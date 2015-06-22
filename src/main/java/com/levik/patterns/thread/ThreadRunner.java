package com.levik.patterns.thread;

public class ThreadRunner {

    private static final long MILLIS = 10000l;

    public static void main(String[] args) throws InterruptedException {
        final WorkerProcess workerProcess = new WorkerProcess();
        final Thread thread = new Thread(workerProcess, "Worker");
        thread.start();

        final Thread currentThread = Thread.currentThread();
        currentThread.setName("currentThread");

        Thread.sleep(MILLIS);

        workerProcess.terminate();

        thread.join();

        System.out.println("End main program.");
    }
}
