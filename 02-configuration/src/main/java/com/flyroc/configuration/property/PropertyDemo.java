package com.flyroc.configuration.property;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName
 * @Description 带前缀属性配置
 * 使用@ConfigurationProperties将property的配置映射到这个类的属性中
 * @Author cyf
 * @Date 2019/10/15$ 17:34$
 * @Version v0.0.1
 */
@Configuration
@ConfigurationProperties(prefix = "my.config")
public class PropertyDemo {

    private String app;

    private String user;

    private int age;

    private String email;

    private String blog;

    private String github;

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBlog() {
        return blog;
    }

    public void setBlog(String blog) {
        this.blog = blog;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

}
