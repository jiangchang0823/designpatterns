package com.iss.designpatterns.anno;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description: TODO
 * @author: VODE CODC
 * @create: 2023-06-28 10:55
 **/

@Configuration
public class ConfigurationToCountry {

    @Bean
    public Country get1(){
        return new Country();
    }

}
