package com.g6.pay.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.g6.contract.entity.PayInfoEntity;
import com.g6.contract.utils.PageUtils;

import java.util.Map;

/**
 * 
 *
 * @author g6
 * @email huahangxiaohui@163.com
 * @date 2020-05-05 15:45:02
 */
public interface PayInfoService extends IService<PayInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

