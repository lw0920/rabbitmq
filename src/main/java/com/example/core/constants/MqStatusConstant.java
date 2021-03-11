package com.example.core.constants;

/**
 * @Description:
 * @Author: luw
 * @Date: 2021/3/11 20:17
 */

public class MqStatusConstant {

    /**
     * 准备发送
     */
    public static final String PREPARED = "P0";
    /**
     * 发送完成
     */
    public static final String SEND_COMPLETED = "P1";
    /**
     * 发送出错
     */
    public static final String SEND_FAULT = "P2";
    /**
     * 消费超时
     */
    public static final String DEAL_TIMEOUT = "P3";
    /**
     * 达到最大消费次数
     */
    public static final String DEAL_MAX_LENGTH = "P4";
    /**
     * 取消消息
     */
    public static final String CANCELED = "P5";
    /**
     * 消费成功
     */
    public static final String DEAL_PREPARED = "C0";
    public static final String DEAL_SUCCESS = "C1";
    public static final String DEAL_FAULT = "C2";
}
