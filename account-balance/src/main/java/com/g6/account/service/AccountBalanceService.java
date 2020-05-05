package com.g6.account.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.g6.contract.entity.AccountBalanceEntity;
import com.g6.contract.utils.PageUtils;

import java.util.Map;

/**
 * 
 *
 * @author g6
 * @email huahangxiaohui@163.com
 * @date 2020-05-05 15:45:03
 */
public interface AccountBalanceService extends IService<AccountBalanceEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

