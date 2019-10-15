package com.flyroc.web4jsp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName
 * @Description //TODO
 * @Author cyf
 * @Date 2019/10/15$ 21:29$
 * @Version v0.0.1
 */
@RestController
public class IndexController {

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

}
