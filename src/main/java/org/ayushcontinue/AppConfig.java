package org.ayushcontinue;

/*this is java based configuration in spring allow us to configure beans using java classes
instead of traditional xml configuration */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

//this annotation is used to make sure this class is a configuration class
@Configuration
public class AppConfig {


    @Bean
    //this bean is singleton by default which means only one object is created and it is accessed the all the time it is
    //it is created again
    public Desktop desktop(){
        return new Desktop();
    }


    @Bean
    //here we have made this bean scope as the prototype means each time it is created another bean is created.
    @Scope("prototype")
    public Desktop desktop1(){
        return new Desktop();
    }


}
