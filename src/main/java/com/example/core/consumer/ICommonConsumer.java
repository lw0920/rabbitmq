package com.example.core.consumer;

import com.example.core.model.BaseQueueMessage;
import com.example.core.model.MessageResult;

/**
 * @Description:
 * @Author: luw
 * @Date: 2021/3/11 19:57
 */

public interface ICommonConsumer<R extends BaseQueueMessage> {

    /**
     * handle 方法及handle方法以下不要将exception catch
     *
     * @param request
     * @return
     */
    MessageResult handle(R request);

    /**
     * 获取消息类型
     * @return
     */
    Class<R> getMessageClass();
}
