package com.g6.contract.feign;

import com.g6.contract.constant.Api;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @Author: g6
 * @Date: 2020/5/5 16:23
 */
@FeignClient(name = "payFeignService",url= Api.PAY_URL)
public interface PayFeignService {
}
