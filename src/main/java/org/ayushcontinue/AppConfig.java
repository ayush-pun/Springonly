package org.ayushcontinue;

/*this is java based configuration in spring allow us to configure beans using java classes
instea of traditional xml configuration */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//this annotation is used to make sure this class is a configuration class
@Configuration
public class AppConfig {

    /**this annotation is creating the bean of Desktop class and the name of the
    bean is "desktop"
     * */
    @Bean
    public Desktop desktop(){
        return new Desktop();
    }

    /* this is an way to change the name of the bean form the default and you can also have multiple names*/

    @Bean(name = {"comp2","desktop1","beast"})
    public Desktop desktop1(){
        return new Desktop();
    }

    /*● @Configuration: Marks the class as a source of bean definitions.
      ● @Bean: Defines a bean, and the method name (desktop) becomes the bean
        name by default.
      ● AnnotationConfigApplicationContext: Initializes the Spring context with
        the provided configuration class. */

}
