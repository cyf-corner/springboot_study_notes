package com.flyroc.configuration;

import com.flyroc.configuration.property.PropertyDemo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

/**
 * @ClassName
 * @Description //TODO
 * @Author cyf
 * @Date 2019/10/15$ 17:43$
 * @Version v0.0.1
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PropertyDemoTest {

    @Autowired
    private PropertyDemo property;

    @Test
    public void getApp() throws Exception {
        assertEquals("02-configuration", property.getApp());
    }

    @Test
    public void getUser() throws Exception {
        assertEquals("cyf", property.getUser());
    }

}
