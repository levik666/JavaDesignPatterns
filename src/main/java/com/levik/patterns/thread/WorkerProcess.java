package com.levik.patterns.thread;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class WorkerProcess implements Runnable{

    private volatile boolean flag;

    private static final long MILLIS = 5l;

    @Override
    public void run() {
        while (!flag){
            final String treadName = Thread.currentThread().getName();
            System.out.println("Start do some work " + Calendar.getInstance().getTime() + " thread name " + treadName);
            sleep(MILLIS);
            System.out.println("Finished some work " + Calendar.getInstance().getTime() + " thread name " + treadName);
        }
    }

    public void terminate(){
        flag = true;
    }

    private void sleep(long millis){
        try {
            TimeUnit.SECONDS.sleep(millis);
        } catch (InterruptedException exe) {
            System.err.println("Some error exe " + exe.getMessage());
        }
    }
}
