package com.g6.contract.enums;

/**
 * @Author: g6
 * @Date: 2020/5/5 20:15
 */
public enum EnumsMessageSource {

    PAY(1,"支付系统");

    private Integer value;
    private String text;

    EnumsMessageSource(Integer value,String text){
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
