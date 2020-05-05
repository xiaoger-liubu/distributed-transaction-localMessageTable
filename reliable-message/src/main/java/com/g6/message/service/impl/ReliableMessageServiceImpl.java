package com.g6.message.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.g6.contract.entity.ReliableMessageEntity;
import com.g6.contract.utils.PageUtils;
import com.g6.contract.utils.Query;
import com.g6.message.dao.ReliableMessageDao;
import com.g6.message.service.ReliableMessageService;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("reliableMessageService")
public class ReliableMessageServiceImpl extends ServiceImpl<ReliableMessageDao, ReliableMessageEntity> implements ReliableMessageService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<ReliableMessageEntity> page = this.page(
                new Query<ReliableMessageEntity>().getPage(params),
                new QueryWrapper<ReliableMessageEntity>()
        );

        return new PageUtils(page);
    }

}