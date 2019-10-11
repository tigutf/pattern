package com.tf.pattern.strategy.product.impl;

import com.tf.pattern.strategy.product.LoginLauncherStrategy;

/**
 * @Author TF
 * @Date 2019/10/12 1:03
 * @Desc TODO
 */
public class SmsLoginLauncher implements LoginLauncherStrategy {
    @Override
    public boolean onLaunch(String... args) {
        doSomething(args);
        return false;
    }
    //TODO 自定义业务逻辑
    private void doSomething(String[] params) {
        System.out.println("短信验证登录");
        for(String ss:params){
            System.out.println("@#$参数："+ss);
        }
    }
}
