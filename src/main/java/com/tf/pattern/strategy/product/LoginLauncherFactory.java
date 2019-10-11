package com.tf.pattern.strategy.product;

/**
 * @Author TF
 * @Date 2019/10/12 0:47
 * @Desc TODO
 */
public class LoginLauncherFactory {
    private static LoginLauncherStrategy instance = null;

    public static LoginLauncherStrategy getInstance(String clzName){
        try {
            instance = (LoginLauncherStrategy)Class.forName(clzName).newInstance();
        }catch (Exception e){
            System.out.println("Class not found.check the param 'clzName'. ");
            return  null;
        }
        return instance;
    }
}
