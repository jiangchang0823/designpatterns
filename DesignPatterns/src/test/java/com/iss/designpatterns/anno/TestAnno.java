package com.iss.designpatterns.anno;

import com.iss.designpatterns.DesignPatternsApplication;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @description: TODO
 * @author: VODE CODC
 * @create: 2023-06-28 11:47
 **/

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {DesignPatternsApplication.class})
@Slf4j
public class TestAnno {

    @Autowired
    private ConfigurationToCountry configurationToCountry;

    @Autowired
    private ComponentToCountry componentToCountry;

    @Test
    public void getConfiguration() {
        Country country = configurationToCountry.get1();
        Country country1 = configurationToCountry.get1();
        System.out.println(country == country1);
    }

    @Test
    public void getComponent() {
        Country country = componentToCountry.get();
        Country country1 = componentToCountry.get();
        System.out.println(country == country1);

    }

}
