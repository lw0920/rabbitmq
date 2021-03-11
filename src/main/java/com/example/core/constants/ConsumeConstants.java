package com.example.core.constants;

import lombok.Data;

/**
 * @Description:
 * @Author: luw
 * @Date: 2021/3/11 20:07
 */
@Data
public final class ConsumeConstants {

    /**
     * 设置消息被取消的前缀
     */
    public static final String PREFIX_MESSAGE_CANCELED = "producer_data_canceled_";

    /**
     * 设置消费次数到redis时key的前缀
     */
    public static final String PREFIX_CONSUMER_HANDLE_NUMS = "consumer_handle_nums_key_";

    /**
     * 设置消费者ip到redis时的key前缀
     */
    public static final String PREFIX_CONSUMER_HANDLE_IP = "consumer_handle_ip_key_";

    /**
     * 消费结果的redis缓存key的前缀
     */
    public static final String PREFIX_CONSUMER_HANDLE_RESULT = "consumer_handle_result_key_";

    /**
     * 最大消费次数
     */

    public static final int MAX_CONSUMER_HANDLE_NUMS = 3;

}
