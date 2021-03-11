package com.example.core.enums;

/**
 *
 */
public enum CommonResultEnums {

    SUCCESS("MQ0000","消息处理成功"),
    SEND_ERROR("MQ0001", "消息发送失败"),
    CANCELED("MQ0002","消息被取消"),
    EXCEPTION_HANDLE_ERROR("MQ1001","处理失败");

    private final String code;
    private final String message;

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    private CommonResultEnums(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
