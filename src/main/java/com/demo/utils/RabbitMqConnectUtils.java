package com.demo.utils;

import com.example.core.producer.ICommonProducer;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.amqp.rabbit.connection.Connection;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitMessagingTemplate;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @Description:
 * @Author: luw
 * @Date: 2021/3/11 23:03
 */

@Component
@RequestMapping(value = "/api/rabbitmq")
public class RabbitMqConnectUtils implements ICommonProducer {

    @Autowired
    private RabbitMessagingTemplate rabbitMessagingTemplate;

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @RequestMapping(value = "/")
    public Connection getMqConnection(){

        System.out.println(rabbitTemplate);
        return rabbitMessagingTemplate.getRabbitTemplate().getConnectionFactory().createConnection();
    }

}
