package com.tf.pattern.strategy.product.impl;

import com.tf.pattern.strategy.product.LoginLauncherStrategy;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author TF
 * @Date 2019/10/12 0:52
 * @Desc TODO
 */
@Slf4j
public class PasswordLoginLauncher implements LoginLauncherStrategy {
    @Override
    public boolean onLaunch(String... params) {
        doSomething(params);
        return false;
    }
    //TODO 自定义业务逻辑
    private void doSomething(String[] params) {
        System.out.println("校验密码登录");
        for(String ss:params){
            System.out.println("@#$参数："+ss);
        }
    }

}
