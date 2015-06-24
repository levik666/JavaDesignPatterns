package com.levik.patterns.thread;

import java.util.concurrent.TimeUnit;

public class ThreadRunner {

    private static final long SECONDS = 30l;

    public static void main(String[] args) throws InterruptedException {
        final WorkerProcess workerProcess = new WorkerProcess();
        final Thread thread = new Thread(workerProcess, "Worker");
        thread.start();

        final Thread currentThread = Thread.currentThread();
        currentThread.setName("currentThread");

        TimeUnit.SECONDS.sleep(SECONDS);

        workerProcess.terminate();

        thread.join();

        System.out.println("End main program.");
    }
}
