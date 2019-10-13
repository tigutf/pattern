package com.tf.pattern.strategy;

import com.tf.pattern.strategy.chain.Handler;
import com.tf.pattern.strategy.chain.bean.Request;
import com.tf.pattern.strategy.chain.bean.Response;
import com.tf.pattern.strategy.chain.impl.OcrHandler;
import com.tf.pattern.strategy.chain.impl.PasswordHandler;
import com.tf.pattern.strategy.chain.impl.SmsLoginHandler;
import com.tf.pattern.strategy.product.LoginLauncherFactory;
import com.tf.pattern.strategy.product.LoginLauncherStrategy;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.Random;

/**
 * @Author TF
 * @Date 2019/10/12 2:03
 * @Desc TODO
 */

@RunWith(SpringRunner.class)
@SpringBootTest
//由于是Web项目，Junit需要模拟ServletContext，因此我们需要给我们的测试类加上@WebAppConfiguration。
@WebAppConfiguration
public class ChainTest {

    @Before
    public void init() {
        System.out.println("责任链开始测试-----------------");
    }
    @After
    public void after() {
        System.out.println("责任链测试结束-----------------");
    }

    @Test
    public void testLoginStrategy(){
        Handler handler1 = new PasswordHandler();
        Handler handler2 = new OcrHandler();
        Handler handler3 = new SmsLoginHandler();
        handler1.setNextHandler(handler2);
        handler2.setNextHandler(handler3);
        Random random = new Random();
        int index = random.nextInt(10)%3 + 1;
        Response response = handler1.handleMessage(new Request(index));
        System.out.println("执行结果："+response.getMsg());
    }
}
