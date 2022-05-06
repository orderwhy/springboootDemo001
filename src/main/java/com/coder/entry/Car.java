package com.coder.entry;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "mycar")
//@Component
@Data
public class Car {

    private String brand;

    private Float price;

}
