package com.g6.contract.enums;

/**
 * @Author: g6
 * @Date: 2020/5/5 20:08
 */
public enum EnumsDead {
    HAS_DEAD("Y","已死亡"),
    NEED_DEAD("N","未死亡");


    private String value;
    private String text;

    EnumsDead(String value,String text){
        this.value = value;
        this.text = text;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
