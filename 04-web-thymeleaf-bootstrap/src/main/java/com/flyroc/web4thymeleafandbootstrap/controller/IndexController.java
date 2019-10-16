package com.flyroc.web4thymeleafandbootstrap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName
 * @Description //TODO
 * @Author cyf
 * @Date 2019/10/15$ 22:05$
 * @Version v0.0.1
 */
@Controller
public class IndexController {
    @RequestMapping("/index")
    public String index(Model model) {
        model.addAttribute("name", "cyf");
        return "index";
    }
}
