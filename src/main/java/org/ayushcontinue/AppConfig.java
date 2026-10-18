package org.ayushcontinue;

/*this is java based configuration in spring allow us to configure beans using java classes
instead of traditional xml configuration */

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.AbstractList;

//this annotation is used to make sure this class is a configuration class
@Configuration
public class AppConfig {

    //we can use @Qualifier for explicit reference like we use the ref attribut in property
    //in the xml config
    @Bean
    public Alien alien(@Qualifier("desktop") Computer comp){
        Alien obj = new Alien();
        obj.setAge(25);
        obj.setComp(comp);
        return obj;
    }

    @Bean
    public Desktop desktop(){
        return new Desktop();
    }

    @Bean
    public Laptop laptop(){
        return new Laptop();
    }
}
