package com.ning.selfproject.justforfun.config;

import com.ning.selfproject.justforfun.entity.TestEntity;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    private static Logger logger = LogManager.getLogger(Config.class.getName());

    @Bean
    public TestEntity testEntity() {
        logger.info("生成bean TestEntity");
        return new TestEntity();
    }

}
