package com.g6.contract.entity;

import lombok.Data;

/**
 * @Author hx
 * @Date 2019/7/16 3:36 PM
 * @Version 1.0
 * @Description TODO
 */

@Data
public class ResultMsg<T> {

    protected static final int HTTP_STATUS_SUCCESS = 200;
    protected static final int HTTP_STATUS_ERROR = 500;

    protected static final String HTTP_STATUS_SUCCESS_MSG = "操作成功！";
    protected static final String HTTP_STATUS_ERROR_MSG = "操作失败！";

    protected int code;
    protected String msg;
    protected T data;

    protected ResultMsg(){}

    public static ResultMsg success(){
        ResultMsg resultMsg = new ResultMsg();
        resultMsg.setCode(HTTP_STATUS_SUCCESS);
        resultMsg.setMsg(HTTP_STATUS_SUCCESS_MSG);
        return resultMsg;
    }

    public static ResultMsg error(){
        ResultMsg resultMsg = new ResultMsg();
        resultMsg.setCode(HTTP_STATUS_ERROR);
        resultMsg.setMsg(HTTP_STATUS_ERROR_MSG);
        return resultMsg;
    }

    public static ResultMsg error(int errorCode){
        ResultMsg resultMsg = new ResultMsg();
        resultMsg.setCode(errorCode);
        resultMsg.setMsg(HTTP_STATUS_ERROR_MSG);
        return resultMsg;
    }

    public static ResultMsg error(int errorCode,String msg){
        ResultMsg resultMsg = new ResultMsg();
        resultMsg.setCode(errorCode);
        resultMsg.setMsg(msg);
        return resultMsg;
    }

}