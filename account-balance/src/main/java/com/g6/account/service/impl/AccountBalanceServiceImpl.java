package com.g6.account.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.g6.account.dao.AccountBalanceDao;
import com.g6.account.entity.AccountBalanceEntity;
import com.g6.account.service.AccountBalanceService;
import com.g6.contract.utils.PageUtils;
import com.g6.contract.utils.Query;
import org.springframework.stereotype.Service;

import java.util.Map;



@Service("accountBalanceService")
public class AccountBalanceServiceImpl extends ServiceImpl<AccountBalanceDao, AccountBalanceEntity> implements AccountBalanceService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {

        IPage<AccountBalanceEntity> page = this.page(
                new Query<AccountBalanceEntity>().getPage(params),
                new QueryWrapper<AccountBalanceEntity>()
        );

        return new PageUtils(page);
    }

}