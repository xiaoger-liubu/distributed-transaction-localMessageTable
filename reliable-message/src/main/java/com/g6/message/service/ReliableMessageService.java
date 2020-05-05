package com.g6.message.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.g6.contract.entity.ReliableMessageEntity;
import com.g6.contract.utils.PageUtils;

import java.util.Map;

/**
 * 
 *
 * @author g6
 * @email huahangxiaohui@163.com
 * @date 2020-05-05 15:45:03
 */
public interface ReliableMessageService extends IService<ReliableMessageEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

