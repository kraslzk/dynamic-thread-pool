package cn.lzk.middleware.dynamic.thread.pool.sdk.policy;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

public class NewThreadRunPolicy implements RejectedExecutionHandler {
    NewThreadRunPolicy() {
    }

    /**
     * Creates a new thread and executes the task.
     * @param r the runnable task requested to be executed
     * @param executor the executor attempting to execute this task
     */
    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        if (!executor.isShutdown()) {
            new Thread(r).start();
        }
    }
}
