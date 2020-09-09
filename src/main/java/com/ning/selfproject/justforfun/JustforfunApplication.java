package com.ning.selfproject.justforfun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@ComponentScan(basePackages = {"com.ning.selfproject"})
public class JustforfunApplication {

    public static void main(String[] args) {
        SpringApplication.run(JustforfunApplication.class, args);
    }

}
