package com.g6.contract.component;

import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author: g6
 * @Date: 2020/3/8 18:46
 */
@Slf4j
public class SSHSession {

    private static String HOST = "123.56.126.173";
    private static int PORT = 22;
    private static String NAME = "root";
    private static String PRI_KEY_PATH = "/Users/huixiaolv/G6/105.aliyun/id_rsa";
//    private static String PRI_KEY_PATH = "/Users/hx/Documents/2Work/104.aliyun/id_rsa";
    private static boolean byPassword = false;

    private static int lport = 23306;
    private static String rhost = "rm-2ze96pwx15yznwd6t125010.mysql.rds.aliyuncs.com";
    private static int rport = 3306;
    private static Session session = null;

    private static String WINNER_USER_NAME = "root";
    private static String WINNER_PASSWORD = "winner_2020";
    private static String WINNER_HOST = "39.98.210.139";
    private static int WINNER_PORT = 22;
    private static String WINNER_REMOTE_HOST = "0.0.0.0";
    private static int WINNER_REMOTE_PORT = 28080;



    public static void localPortForward(){
        if(byPassword){
            localPortForwardByPwd();
        }else{
            localPortForwardByPriKey();
        }
    }


    /**
     * 远程端口，映射到本地端口
     */
    private static void localPortForwardByPwd(){
        JSch jSch = new JSch();
        try{
            session = jSch.getSession(WINNER_USER_NAME,WINNER_HOST,WINNER_PORT);
            session.setPassword(WINNER_PASSWORD);
            session.setConfig("StrictHostKeyChecking","no");
            session.connect();
            session.setPortForwardingR(WINNER_REMOTE_PORT,WINNER_REMOTE_HOST,lport);
            System.out.println("本地端口映射已启动， 本地:"+lport+"，远程："+WINNER_HOST+":"+WINNER_REMOTE_PORT+"...");
        }catch(Exception e){
            log.error("远程端口映射到本地端口异常....");
        }
    }


    /**
     * 本地端口，映射到远程端口
     */
    private static void localPortForwardByPriKey(){
        JSch jSch = new JSch();
        try {
            jSch.addIdentity(PRI_KEY_PATH);
            session = jSch.getSession(NAME, HOST, PORT);
            session.setConfig("StrictHostKeyChecking","no");
            session.connect();
            int i = session.setPortForwardingL(lport, rhost, rport);
            System.out.println("本地端口映射已启动，本地:"+lport+"，远程："+HOST+":3306...");
        } catch (JSchException e) {
            e.printStackTrace();
        }
    }

    public static void stopLocalPortForward() {
        session.disconnect();
        System.out.println("本地端口映射已关闭...");
    }


}
