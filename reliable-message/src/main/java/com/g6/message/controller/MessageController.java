package com.g6.message.controller;

import com.g6.contract.entity.ReliableMessageEntity;
import com.g6.contract.entity.ResultMsg;
import com.g6.contract.vo.ReliableMessageVo;
import com.g6.message.service.ReliableMessageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: g6
 * @Date: 2020/5/5 21:14
 */
@Slf4j
@RestController
@RequestMapping("/message")
public class MessageController {

    @Autowired
    ReliableMessageService messageService;

    @PostMapping("/pre")
    public ResultMsg<String> pre(@RequestBody ReliableMessageVo messageVo){
        ResultMsg<String> result = ResultMsg.success();
        try{
            messageService.save(ReliableMessageEntity.resolve(messageVo));
        }catch (Exception e){
            result = ResultMsg.error();
            log.error("可靠消息服务pre异常...",e);
        }
        return result;
    }

    @PostMapping("/confirm")
    public ResultMsg<String> confirm(){
        ResultMsg<String> result = ResultMsg.success();
        try{

        }catch (Exception e){
            result = ResultMsg.error();
            log.error("可靠消息服务confirm异常...",e);
        }
        return result;
    }

    @PostMapping("/finish")
    public ResultMsg<String> finish(){
        ResultMsg<String> result = ResultMsg.success();
        try{

        }catch (Exception e){
            result = ResultMsg.error();
            log.error("可靠消息服务finish异常...",e);
        }
        return result;
    }


}
