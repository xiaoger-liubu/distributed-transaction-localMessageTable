package com.g6.account.controller;

import com.g6.contract.constant.Apis;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: g6
 * @Date: 2020/5/5 16:46
 */
@Slf4j
@RestController
public class AccountController {

    @GetMapping(value = Apis.ACCOUNT_INDEX)
    public String index(@RequestParam(value = "name")String name){
        return "hello,"+name;
    }


}
