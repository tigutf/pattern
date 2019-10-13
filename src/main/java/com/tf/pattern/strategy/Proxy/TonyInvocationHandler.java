package com.tf.pattern.strategy.Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author TF
 * @Date 2019/10/14 0:53
 * @Desc TODO
 */
public class TonyInvocationHandler implements InvocationHandler {

    //被代理者
    Class<?> cls =null;
    //被代理的实例
    Object obj = null;

    //我要代理谁
    public TonyInvocationHandler(Object _obj){
        this.obj = _obj;
    }

    /**
     * proxy：代表动态代理对象
     * method：代表正在执行的方法
     * args：代表当前执行方法传入的实参
     * 返回值：表示当前执行方法的返回值
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        device1();
        Object result = method.invoke(this.obj, args);
        device2();
        return result;
    }

    private void device1() {
        System.out.println("我是前置通知：可以定义执行前你先做什么");
    }
    private void device2() {
        System.out.println("我是后置操作：可以定义执行后你想做什么");
    }
}
