package pl.dmichalski.c02_17_multithreading_using_task_executor.thread;

import java.util.Date;
import java.util.concurrent.*;

/**
 * Author: Daniel
 */
public class ExecutorsDemo {

    private Runnable task = new DemonstrationRunnable();

    public ExecutorsDemo() throws Throwable {

//        cachedThreadPoolExecutorService();
//        fixedThreadPool();
//        singleThreadExecutorService();
//        es();
        scheduledExecutorService();
    }

    private void cachedThreadPoolExecutorService() throws InterruptedException, ExecutionException {
        ExecutorService cachedThreadPoolExecutorService = Executors.newCachedThreadPool();
        if (cachedThreadPoolExecutorService.submit(task).get() == null) {
            System.out.printf("cachedThreadPoolExecutorService finished at: %s \n", new Date());
        }
    }

    private void fixedThreadPool() throws InterruptedException, ExecutionException {
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(100);
        if (fixedThreadPool.submit(task).get() == null) {
            System.out.printf("fixedThreadPool finished at: %s \n", new Date());
        }
    }

    private void singleThreadExecutorService() throws InterruptedException, ExecutionException {
        ExecutorService singleThreadExecutorService = Executors.newSingleThreadExecutor();
        if (singleThreadExecutorService.submit(task).get() == null) {
            System.out.printf("singleThreadExecutorService finished at: %s \n", new Date());
        }
    }

    private void es() throws InterruptedException, ExecutionException {
        ExecutorService es = Executors.newCachedThreadPool();
        if (es.submit(task, Boolean.TRUE).get().equals(Boolean.TRUE)) {
            System.out.println("The task has been finished");
        }
    }

    private void scheduledExecutorService() throws InterruptedException, ExecutionException {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(10);
        if (scheduledExecutorService.schedule(task, 10, TimeUnit.SECONDS).get() == null) {
            System.out.printf("scheduledExecutorService finished at: %s \n", new Date());
        }

        scheduledExecutorService.scheduleAtFixedRate(task, 0, 5, TimeUnit.SECONDS);
    }

}
