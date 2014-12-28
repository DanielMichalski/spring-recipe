package pl.dmichalski.c02_18_spring_executors.thread;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.task.SimpleAsyncTaskExecutor;
import org.springframework.core.task.SyncTaskExecutor;
import org.springframework.core.task.support.TaskExecutorAdapter;

/**
 * Author: Daniel
 */
public class SpringExecutor {

    @Autowired
    private SimpleAsyncTaskExecutor asyncTaskExecutor;

    @Autowired
    private SyncTaskExecutor syncTaskExecutor;

    @Autowired
    private TaskExecutorAdapter taskExecutorAdapter;

    @Autowired
    private DemonstrationRunnable task;

    public void submitJobs() {
        syncTaskExecutor.execute(task);
        taskExecutorAdapter.execute(task);
        asyncTaskExecutor.execute(task);
    }

}
