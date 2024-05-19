package com.iss.designpatterns.anno;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description: 通过@Configuration注解表明这是一个配置类
 * @author: VODE CODC
 * @create: 2023-06-28 10:55
 **/

@Configuration
public class ConfigurationToCountry {

    /**
     * @Bean注解的作用是将方法的返回值交给Spring容器管理
     * @return
     */
    @Bean
    public Country get1(){

        return new Country();
    }
    

}
