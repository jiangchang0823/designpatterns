package com.iss.designpatterns.anno;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @description: TODO
 * @author: VODE CODC
 * @create: 2023-06-28 10:55
 **/

@Component
public class ComponentToCountry {

    @Bean
    public Country get(){
        return new Country();
    }

}
