package cn.lzk.middleware.dynamic.thread.pool.sdk.policy;

public interface RejectedPolicy {
    String CallerRunsPolicy = "CallerRunsPolicy";
    String AbortPolicy = "AbortPolicy";
    String DiscardPolicy = "DiscardPolicy";

    String DiscardOldestPolicy = "DiscardOldestPolicy";

    String NewThreadRunPolicy = "NewThreadRunPolicy";

    String RetryPushPolicy = "RetryPushPolicy";
}
