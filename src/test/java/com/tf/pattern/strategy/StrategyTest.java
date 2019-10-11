package com.tf.pattern.strategy;

import com.tf.pattern.strategy.product.LoginLauncherFactory;
import com.tf.pattern.strategy.product.LoginLauncherStrategy;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author TF
 * @Date 2019/10/12 1:11
 * @Desc TODO
 */
@RunWith(SpringRunner.class)
@SpringBootTest
//由于是Web项目，Junit需要模拟ServletContext，因此我们需要给我们的测试类加上@WebAppConfiguration。
@WebAppConfiguration
public class StrategyTest {

    final Map<String,String> launchersMap = new HashMap<>(8);

    @Before
    public void init() {
        System.out.println("开始测试-----------------");
        launchersMap.put("1","com.tf.pattern.strategy.product.impl.PasswordLoginLauncher");
        launchersMap.put("2","com.tf.pattern.strategy.product.impl.OcrLoginLauncher");
        launchersMap.put("3","com.tf.pattern.strategy.product.impl.SmsLoginLauncher");

    }
    @After
    public void after() {
        System.out.println("测试结束-----------------");
    }

    @Test
    public void testLoginStrategy(){
        String[][] s1 = {{"user","123456"},{"your face ID","Device ID"},{"your phone","token"}};
        for (Integer flag = 1; flag<=3; flag++){
            String clazz = launchersMap.get(flag.toString());
            System.out.println("获取到的class为"+clazz);
            LoginLauncherStrategy launcher = LoginLauncherFactory.getInstance(clazz);
            if (launcher != null){
                launcher.onLaunch(s1[flag-1]);
            }
        }
    }
}
