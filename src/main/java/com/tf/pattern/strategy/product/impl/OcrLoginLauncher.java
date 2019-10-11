package com.tf.pattern.strategy.product.impl;

import com.tf.pattern.strategy.product.LoginLauncherStrategy;

/**
 * @Author TF
 * @Date 2019/10/12 1:00
 * @Desc TODO
 */
public class OcrLoginLauncher implements LoginLauncherStrategy {
    @Override
    public boolean onLaunch(String... args) {
        doSomething(args);
        return false;
    }
    //TODO 自定义业务逻辑
    private void doSomething(String[] params) {
        System.out.println("OCR人脸识别登录");
        for(String ss:params){
            System.out.println("@#$参数："+ss);
        }
    }
}
