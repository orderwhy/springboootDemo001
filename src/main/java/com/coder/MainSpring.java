package com.coder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

//@SpringBootApplication(scanBasePackages = "com.coder")
@SpringBootConfiguration
@EnableAutoConfiguration
@ComponentScan("com.coder")
public class MainSpring {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(MainSpring.class, args);

        boolean user01 = run.containsBean("user01");
        System.out.println(user01);

    }
}
