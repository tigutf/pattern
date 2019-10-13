package com.tf.pattern.strategy.Proxy;

import com.tf.pattern.strategy.Proxy.service.IPlayer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @Author TF
 * @Date 2019/10/14 0:57
 * @Desc TODO
 */
public class Client {
    public static void main(String[] args) throws Throwable  {
        System.out.println("开始时间是："+ System.currentTimeMillis());
        //定义一个痴迷的玩家
        IPlayer player = new TonyPlayer("张三");
        //定义一个hanlder
        InvocationHandler handler = new TonyInvocationHandler(player);
        //获得类的class loader
        ClassLoader clazzLoader = player.getClass().getClassLoader();
        //动态产生一个代理者
        IPlayer proxy = (IPlayer) Proxy.newProxyInstance(clazzLoader,new Class[]{IPlayer.class},handler);
        //登录
        proxy.login("zhangSan", "password");
        proxy.doSomething1();
        proxy.doSomething2();
        //记录结束游戏时间
        System.out.println("结束时间是："+ System.currentTimeMillis());
    }


}
