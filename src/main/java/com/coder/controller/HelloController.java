package com.coder.controller;

import com.coder.entry.Car;
import com.coder.entry.TestObject;
import com.coder.entry.VaildGroup;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableConfigurationProperties(Car.class)
@Slf4j
public class HelloController {

    @Autowired
    private Car car;

    @RequestMapping("car222")
    public Car car() {
        log.info("-----------");
        return car;
    }

    @RequestMapping(value = "hello",method = RequestMethod.POST)
    public String hello() {
        return "hello world";
    }

    @RequestMapping(value = "put", method = RequestMethod.PUT)
    public String put() {
        return "put...";
    }

    @PostMapping("test002")
    public String test22(@RequestBody @Validated({VaildGroup.class}) TestObject testObject) {

        return "hello";
    }

    @ExceptionHandler
    public String exceptionHandle(MethodArgumentNotValidException e) {
        return "参数校验错误： 5002";
    }

}
