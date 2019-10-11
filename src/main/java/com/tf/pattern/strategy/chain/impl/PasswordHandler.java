package com.tf.pattern.strategy.chain.impl;

import com.tf.pattern.strategy.chain.Handler;
import com.tf.pattern.strategy.chain.bean.Request;
import com.tf.pattern.strategy.chain.bean.Response;

/**
 * @Author TF
 * @Date 2019/10/12 1:55
 * @Desc TODO
 */
public class PasswordHandler extends Handler {

    private static final Integer PASSWORD_LEVEL = 1;

    @Override
    protected int getHandlerLevel() {
        return PASSWORD_LEVEL;
    }

    @Override
    protected Response echo(Request request) {
        System.out.println("校验密码登录");
        Response response = new Response("###校验密码登录成功");
        return response;
    }
}
