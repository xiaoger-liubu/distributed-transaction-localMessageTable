package com.g6.pay.controller;

import com.g6.contract.feign.AccountBalanceFeignService;
import com.g6.contract.feign.PayFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: g6
 * @Date: 2020/5/5 19:39
 */
@Slf4j
@RestController
@RequestMapping("/pay")
public class PayController {

    @Autowired
    AccountBalanceFeignService accountFeignService;

    @Autowired
    PayFeignService payFeignService;

    @GetMapping("/index")
    public String index(){
        return accountFeignService.index("xx");
    }

    @GetMapping("/pay")
    public String pay(){



        return "";
    }

}
