package com.example.core.model;

import com.example.core.enums.CommonResultEnums;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description:
 * @Author: luw
 * @Date: 2021/3/11 18:41
 */
@Data
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class MessageResult<R> {

    private String resultCode;
    private String resultMsg;

    /**
     * 返回结果内容对象，用于自定义返回结果对象的情况
     */
    private R resultContent;

    /**
     * 封装消息处理器
     * @param commonResultEnums
     * @return
     */
    public static MessageResult handle(CommonResultEnums commonResultEnums){
        MessageResult messageResult = new MessageResult();
        messageResult.setResultCode(commonResultEnums.getCode());
        messageResult.setResultContent(commonResultEnums.getMessage());
        return messageResult;
    }

    /**
     * 封装消息处理信息
     * @param commonResultEnums
     * @param extraMeag
     * @return
     */
    public static MessageResult handle(CommonResultEnums commonResultEnums, String extraMeag){
        MessageResult messageResult = handle(commonResultEnums);
        messageResult.setResultContent(commonResultEnums.getMessage() + " " + extraMeag);
        return messageResult;
    }

    /**
     * 封装消息处理结果对象
     * @param resultContent
     * @return
     */
    public MessageResult<R> bindContent(R resultContent) {
        this.setResultContent(resultContent);
        return this;
    }

    public static MessageResult success(){
        return MessageResult.handle(CommonResultEnums.SUCCESS);
    }

    public static MessageResult fail(){
        return MessageResult.handle(CommonResultEnums.EXCEPTION_HANDLE_ERROR);
    }


}
