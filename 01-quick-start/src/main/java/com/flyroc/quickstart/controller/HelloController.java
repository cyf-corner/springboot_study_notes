package com.flyroc.quickstart.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName
 * @Description //TODO
 * @Author cyf
 * @Date 2019/10/15$ 17:14$
 * @Version v0.0.1
 */
@RestController
public class HelloController {

    @RequestMapping("hello")
    public String hello() {
        return "Hello World!";
    }

}
