package com.me.likes.controller;

/**
 * @program: w_parent->GirlFriend
 * @description:
 * @author: szh
 * @create: 2020-08-24 19:21
 **/
public class GirlFriend extends Thread {
    private volatile boolean flag =false;
    public boolean isFlag(){
        return flag;
    }

    @Override
    public void run(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        flag =true;
        System.out.println("flag="+flag);
    }

}