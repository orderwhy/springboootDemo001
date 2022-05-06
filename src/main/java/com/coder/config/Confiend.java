package com.coder.config;

import com.coder.entry.Admin;
import com.coder.entry.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration(proxyBeanMethods = true)
//@Import({User.class, Admin.class})
//@ConditionalOnBean(name = {"admin"})
@ImportResource("classpath:beans.xml")
public class Confiend {

    @Bean("admin")
    public Admin getAdmin() {
        return new Admin("admin", 12);
    }

    @ConditionalOnBean(name = {"admin"})
    @Bean
    public User user() {
        User user = new User();
        user.setAdmin(getAdmin());
        return user;
    }

}


