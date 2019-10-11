package com.tf.pattern.strategy.chain;

import com.tf.pattern.strategy.chain.bean.Request;
import com.tf.pattern.strategy.chain.bean.Response;

/**
 * @Author TF
 * @Date 2019/10/12 1:42
 * @Desc TODO
 */
public abstract class Handler {
    private Handler nextHandler;//每个处理者都必须对请求做出处理
    public final Response handleMessage(Request request){
        Response response = null;
        //判断是否是自己的处理级别
        if(this.getHandlerLevel() == request.getRequestLevel()){
            response = this.echo(request);
        }else{
            if (this.nextHandler != null){
                response = this.nextHandler.handleMessage(request);
            }else {
                System.out.println("没有下一个处理者，直接返回null");
                return null;
            }
        }
        return response;
    }

    public void setNextHandler(Handler _handler){
        this.nextHandler = _handler;
    }

    //每个处理者都有一个处理级别
    protected abstract int getHandlerLevel();
    //每个处理者都必须实现处理任务
    protected abstract Response echo(Request request);
}
