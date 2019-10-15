package com.flyroc.configuration;

import com.flyroc.configuration.random.RandomDemo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.env.RandomValuePropertySource;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertNotNull;

/**
 * @ClassName
 * @Description //TODO
 * @Author cyf
 * @Date 2019/10/15$ 17:43$
 * @Version v0.0.1
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RandomDemoTest {

    @Autowired
    private RandomDemo random;

    @Test
    public void getRandomValue() throws Exception {
        assertNotNull(random.getRandomValue());
    }

    @Test
    public void randomValue() throws Exception {
        // 自定义的一个随机值属性源,起名叫做 myRandom
        // RandomValuePropertySource 类通常用来注入 int，long，uuid 和 string 类型的随机值。
        RandomValuePropertySource randomS = new RandomValuePropertySource("myRandom");
        // 随机生成一个整数
        System.out.println("------------>" + randomS.getProperty("random.value"));
    }

}
