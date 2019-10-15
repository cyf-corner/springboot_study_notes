package com.flyroc.configuration;

import com.flyroc.configuration.property.PropertyDemo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

/**
 * @ClassName
 * @Description //TODO
 * @Author cyf
 * @Date 2019/10/15$ 21:01$
 * @Version v0.0.1
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("dev")//不同环境下读取不同的配置文件
public class ProfileTest {
    @Autowired
    private PropertyDemo property;

    @Test
    public void getApp() throws Exception {
        assertEquals("spring-boot-configuration", property.getApp());
    }

}
