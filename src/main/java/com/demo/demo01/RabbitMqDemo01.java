package com.demo.demo01;

import com.demo.utils.RabbitMqConnectUtils;
import org.springframework.amqp.rabbit.connection.Connection;

/**
 * @Description:
 * @Author: luw
 * @Date: 2021/3/11 21:34
 */


public class RabbitMqDemo01 {

    public static void main(String[] args) {
        RabbitMqConnectUtils rabbitMqConnectUtils = new RabbitMqConnectUtils();
        Connection mqConnection = rabbitMqConnectUtils.getMqConnection();
        System.out.println(mqConnection);
    }

}
