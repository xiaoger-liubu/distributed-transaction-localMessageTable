package com.g6.pay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author: g6
 * @Date: 2020/5/4 20:07
 */
@SpringBootApplication
@EnableFeignClients(basePackages = {"com.g6.contract"})
public class PayApplication {
    
    public static void main(String[] args){
        SpringApplication.run(PayApplication.class,args);
    }
    
}
