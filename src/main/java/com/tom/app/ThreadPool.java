package com.tom.app;
import java.util.concurrent.*;



public class ThreadPool {
    private static ExecutorService pool;
    public static void main(String[] args) {
        pool = new ThreadPoolExecutor
        (1, 
        2,
        1000,
        TimeUnit.MILLISECONDS, 
        new ArrayBlockingQueue<Runnable>(10),
        Executors.defaultThreadFactory(), 
        new ThreadPoolExecutor.AbortPolicy());
	    for (int i = 0; i < 3; i++) {
            pool.execute(new ThreadTask());	
        }
    }
}
