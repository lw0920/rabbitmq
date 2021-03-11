package com.example.core.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description:
 * @Author: luw
 * @Date: 2021/3/11 18:29
 */

@Data
public class BaseQueueMessage implements Serializable {

    @ApiModelProperty(value = "业务流水号")
    private String businessNo;

    @ApiModelProperty(value = "是否进行持久化")
    private boolean extraDurable;

    @ApiModelProperty(value = "指定发送时间，如果时间小于当前时间，该条消息不会被处理")
    private Date scheduledTime;

    @ApiModelProperty(value = "交换器")
    private String exchange;

    @ApiModelProperty(value = "路由key")
    private String routingKey;

    @ApiModelProperty(value = "生产者数据id")
    private String produceId;

    @ApiModelProperty(value = "消息优先级")
    private Integer priority;

    public BaseQueueMessage() {
        this.extraDurable = true;
    }

    public BaseQueueMessage(String businessNo) {
        this();
        this.businessNo = businessNo;
    }

    public BaseQueueMessage(String businessNo, boolean extraDurable) {
        this.businessNo = businessNo;
        this.extraDurable = extraDurable;
    }

    public BaseQueueMessage(String businessNo, boolean extraDurable, Date scheduledTime) {
        this.businessNo = businessNo;
        this.extraDurable = extraDurable;
        this.scheduledTime = scheduledTime;
    }
}
