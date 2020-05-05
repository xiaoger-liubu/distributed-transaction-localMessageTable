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
 * @date 2020-05-05 15:45:02
 */
@Data
@TableName("pay_info")
public class PayInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 支付表ID
	 */
	@TableId
	private String id;
	/**
	 * 支付用户ID
	 */
	private String userId;
	/**
	 * 支付金额
	 */
	private Long payFee;
	/**
	 * 支付时间
	 */
	private Date createTime;

}
