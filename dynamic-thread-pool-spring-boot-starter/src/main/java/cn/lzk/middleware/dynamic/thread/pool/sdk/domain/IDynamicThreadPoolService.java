package cn.lzk.middleware.dynamic.thread.pool.sdk.domain;

import cn.lzk.middleware.dynamic.thread.pool.sdk.domain.model.entity.ThreadPoolConfigEntity;

import java.util.List;

/**
 * @description 动态线程池服务
 * @create 2024-05-12 16:04
 */
public interface IDynamicThreadPoolService {

    List<ThreadPoolConfigEntity> queryThreadPoolList();

    ThreadPoolConfigEntity queryThreadPoolConfigByName(String threadPoolName);

    void updateThreadPoolConfig(ThreadPoolConfigEntity threadPoolConfigEntity);

}
