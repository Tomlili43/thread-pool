package com.tom.app;

public class ThreadTask implements Runnable {	
    public ThreadTask() {}
    public void run() {	
	System.out.println(Thread.currentThread().getName());		
    }
}