package com.g6.account;

import com.g6.contract.component.SSHSession;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author: g6
 * @Date: 2020/5/4 20:12
 */
@SpringBootApplication
@ComponentScan({"com.g6.contract","com.g6.account"})
@EnableFeignClients(basePackages = {"com.g6.contract"})
public class AccountApplication {
    
    public static void main(String[] args){
        SSHSession.localPortForward();
        SpringApplication.run(AccountApplication.class,args);
    }
    
}
