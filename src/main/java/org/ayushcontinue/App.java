package org.ayushcontinue;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Desktop d1 = context.getBean(Desktop.class);
        Desktop d2 = context.getBean(Desktop.class);

        System.out.println(d1 == d2);
    }
}
//by default the scope of the desktop is singelstion so the output will be like this
//Desktop object is created.....
//true
//
//Process finished with exit code 0

