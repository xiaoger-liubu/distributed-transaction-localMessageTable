package com.g6.contract.utils.exception;

/**
 * @Author hx
 * @Date 2019/12/11 2:47 PM
 * @Version 1.0
 * @Description TODO
 */

public class SysException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private String msg;
    private int code = 500;

    public SysException(String msg) {
        super(msg);
        this.msg = msg;
    }

    public SysException(String msg, Throwable e) {
        super(msg, e);
        this.msg = msg;
    }

    public SysException(int code, String msg) {
        super(msg);
        this.msg = msg;
        this.code = code;
    }

    public SysException(int code, String msg, Throwable e) {
        super(msg, e);
        this.msg = msg;
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

}
