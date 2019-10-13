package com.tf.pattern.strategy.Proxy;

import com.tf.pattern.strategy.Proxy.service.IPlayer;

/**
 * @Author TF
 * @Date 2019/10/14 0:50
 * @Desc TODO
 */
public class TonyPlayer implements IPlayer {

    private String name = "";

    //通过构造函数传递名称

    public TonyPlayer(String _name){
        this.name = _name;
    }
    @Override
    public void login(String user, String password) {
        System.out.println("登录名为"+user + " 的用户 " + this.name + "登录成功！");
    }

    @Override
    public void doSomething1() {
        System.out.println(this.name + "在doSomething 1 ！");
    }

    @Override
    public void doSomething2() {
        System.out.println(this.name + "在doSomething 2 ！");
    }
}
