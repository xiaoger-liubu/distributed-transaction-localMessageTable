package com.g6.contract.feign;

import com.g6.contract.constant.Apis;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: g6
 * @Date: 2020/5/5 16:23
 */
@FeignClient(name = "accountBalanceFeignService",url = Apis.ACCOUNT_URL)
public interface AccountBalanceFeignService {

    @GetMapping(value = Apis.ACCOUNT_INDEX)
    public String index(@RequestParam(value = "name")String name);

}
