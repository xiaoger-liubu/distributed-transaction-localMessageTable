package com.g6.contract.component;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * @Author: g6
 * @Date: 2020/5/5 17:37
 */
@Component
public class PortforwardAfterRun implements ApplicationRunner{
    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {
        Runtime.getRuntime().addShutdownHook(new Thread(){
            @Override
            public void run(){
                SSHSession.stopLocalPortForward();
            }
        });
    }
}
