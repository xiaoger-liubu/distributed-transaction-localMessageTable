package com.g6.pay.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.g6.contract.entity.PayInfoEntity;
import com.g6.contract.utils.PageUtils;
import com.g6.contract.utils.Query;
import com.g6.pay.dao.PayInfoDao;
import com.g6.pay.service.PayInfoService;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("payInfoService")
public class PayInfoServiceImpl extends ServiceImpl<PayInfoDao, PayInfoEntity> implements PayInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PayInfoEntity> page = this.page(
                new Query<PayInfoEntity>().getPage(params),
                new QueryWrapper<PayInfoEntity>()
        );

        return new PageUtils(page);
    }

}