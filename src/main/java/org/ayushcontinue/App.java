package org.ayushcontinue;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Alien obj = (Alien) context.getBean("alien");
        obj.age = 22;
        System.out.println(obj.age);
        Alien obj1 = (Alien) context.getBean("alien");
        System.out.println(obj1.age);
        //obj.code();
    }
}
  