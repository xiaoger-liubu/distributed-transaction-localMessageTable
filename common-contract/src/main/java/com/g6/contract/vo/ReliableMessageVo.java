package com.g6.contract.vo;

import com.g6.contract.enums.EnumsMessageSource;
import com.g6.contract.enums.EnumsTopic;
import lombok.Builder;

/**
 * @Author: g6
 * @Date: 2020/5/5 20:01
 */
@Builder
public class ReliableMessageVo {

    /**
     * 消息内容
     */
    private String messageBody;
    /**
     * 消息数据类型
     */
    private String messageCode;
    /**
     * 消息topic
     */
    @Builder.Default
    private String messageTopic = EnumsTopic.TOPIC_PAY.getTopic();
    /**
     * 消息分组
     */
    @Builder.Default
    private String messageGroup = EnumsTopic.TOPIC_PAY.getGroup();
    /**
     * 消息组内顺序
     */
    private Integer groupOrder;
    /**
     * 备注
     */
    private String remark;
    /**
     * 版本号
     */
    private Long version;
    /**
     * 业务主键
     */
    private String bizKey;
    /**
     * 消息来源
     */
    @Builder.Default
    private Integer messageSource = EnumsMessageSource.PAY.getValue();

}
