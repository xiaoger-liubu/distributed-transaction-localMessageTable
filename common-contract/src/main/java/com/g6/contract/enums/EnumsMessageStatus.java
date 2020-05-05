package com.g6.contract.enums;

/**
 * @Author: g6
 * @Date: 2020/5/5 20:11
 */
public enum EnumsMessageStatus {

    WAITING_CONFIRM(0,"待确认"),
    SENDING(1,"发送中");

    private Integer value;
    private String text;

    EnumsMessageStatus(Integer value,String text){
        this.value = value;
        this.text = text;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
