package com.tf.pattern.strategy.chain.impl;

import com.tf.pattern.strategy.chain.Handler;
import com.tf.pattern.strategy.chain.bean.Request;
import com.tf.pattern.strategy.chain.bean.Response;

/**
 * @Author TF
 * @Date 2019/10/12 1:59
 * @Desc TODO
 */
public class SmsLoginHandler  extends Handler {

    private static final Integer SMS_LEVEL = 3;

    @Override
    protected int getHandlerLevel() {
        return SMS_LEVEL;
    }

    @Override
    protected Response echo(Request request) {
        System.out.println("短信验证登录");
        Response response = new Response("###短信登录成功");
        return response;
    }
}
