package com.tf.pattern.strategy.chain.bean;

/**
 * @Author TF
 * @Date 2019/10/12 1:49
 * @Desc TODO
 */
public class Request {

    private int level;

    public Request(int level){
        this.level = level;
    }

    public int getRequestLevel(){
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
