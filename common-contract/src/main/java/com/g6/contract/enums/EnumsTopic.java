package com.g6.contract.enums;

/**
 * @Author: g6
 * @Date: 2020/5/5 20:03
 */
public enum EnumsTopic {

    TOPIC_PAY("Topic_Pay","1","支付topic");

    private String topic;
    private String group;
    private String remark;

    EnumsTopic(String topic,String group,String remark){
        this.topic = topic;
        this.remark = remark;
        this.group = group;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
}
