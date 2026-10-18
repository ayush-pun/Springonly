package org.ayushcontinue;

/*this is java based configuration in spring allow us to configure beans using java classes
instead of traditional xml configuration */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.AbstractList;

//this annotation is used to make sure this class is a configuration class
@Configuration
public class AppConfig {

    @Bean
    public Alien alien(Computer comp){
        Alien obj = new Alien();
        obj.setAge(25);
        //this is making tightly coupled
        // obj.setComp(desktop());

        //previously we had to use the annotation @Autowired but no need anymore
        obj.setComp(comp);
        return obj;
    }

    @Bean
    public Desktop desktop(){
        return new Desktop();
    }
}
