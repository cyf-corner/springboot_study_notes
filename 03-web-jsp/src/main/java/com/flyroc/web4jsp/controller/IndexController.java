package com.flyroc.web4jsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName
 * @Description //TODO
 * @Author cyf
 * @Date 2019/10/15$ 21:29$
 * @Version v0.0.1
 */
@Controller
public class IndexController {

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

}
