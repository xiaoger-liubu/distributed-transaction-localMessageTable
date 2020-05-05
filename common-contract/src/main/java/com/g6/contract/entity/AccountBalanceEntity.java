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
@TableName("account_balance")
public class AccountBalanceEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 账户余额表ID
	 */
	@TableId
	private String id;
	/**
	 * 用户ID
	 */
	private String userId;
	/**
	 * 账户余额
	 */
	private Long accountBalance;
	/**
	 * 账户变动时间
	 */
	private Date createTime;

}
