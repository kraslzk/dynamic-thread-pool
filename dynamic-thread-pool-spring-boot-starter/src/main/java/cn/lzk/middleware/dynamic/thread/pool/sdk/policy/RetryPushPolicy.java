package cn.lzk.middleware.dynamic.thread.pool.sdk.policy;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

public class RetryPushPolicy implements RejectedExecutionHandler {
    private int retryCount = 3;

    RetryPushPolicy() {
    }

    RetryPushPolicy(int retryCount) {
        this.retryCount = retryCount;
    }

    /**
     * retry to push the task if while retryCount > 0 and the executor is not shutdown.
     * @param r the runnable task requested to be executed
     * @param executor the executor attempting to execute this task
     */
    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        while (retryCount > 0 && !executor.isShutdown()) {
            boolean offer = executor.getQueue().offer(r);
            if (offer) {
                return;
            }
            retryCount--;
        }
    }
}
