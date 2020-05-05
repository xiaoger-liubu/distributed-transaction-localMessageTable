package com.g6.contract.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 
 * @author g6
 * @email huahangxiaohui@163.com
 * @date 2020-05-05 15:45:03
 */
@Data
@TableName("reliable_message")
public class ReliableMessageEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 消息ID
	 */
	@TableId
	private String messageId;
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
	private String messageTopic;
	/**
	 * 消息分组
	 */
	private String messageGroup;
	/**
	 * 消息组内顺序
	 */
	private Integer groupOrder;
	/**
	 * 消息重发次数
	 */
	private Integer sendTimes;
	/**
	 * 下次发送时间
	 */
	private Date nextSend;
	/**
	 * 是否死亡 Y :已死亡 N:未死亡
	 */
	private String isDead;
	/**
	 * 0 待确认  1 发送中
	 */
	private Integer status;
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
	private Integer messageSource;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 更新时间
	 */
	private Date updateTime;

}
