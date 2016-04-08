package com.cosmos.fly.web.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;

/**
 * Created by dingdongsheng on 16/4/4.
 */
@Component
public class MyBean implements CommandLineRunner {
    public void run(String... args) {
        System.out.println("fuck~~");
    }

    @PreDestroy
    public void bye() {
        System.out.println("no fuck~~");
    }
}
