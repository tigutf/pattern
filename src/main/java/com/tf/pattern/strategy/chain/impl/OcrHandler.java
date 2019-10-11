package com.tf.pattern.strategy.chain.impl;

import com.tf.pattern.strategy.chain.Handler;
import com.tf.pattern.strategy.chain.bean.Request;
import com.tf.pattern.strategy.chain.bean.Response;

/**
 * @Author TF
 * @Date 2019/10/12 1:58
 * @Desc TODO
 */
public class OcrHandler extends Handler {

    private static final Integer OCR_LEVEL = 2;

    @Override
    protected int getHandlerLevel() {
        return OCR_LEVEL;
    }

    @Override
    protected Response echo(Request request) {
        System.out.println("人脸识别登录");
        Response response = new Response("###人脸识别登录成功");
        return response;
    }
}
