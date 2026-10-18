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

}
