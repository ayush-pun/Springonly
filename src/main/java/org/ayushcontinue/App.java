package org.ayushcontinue;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Alien obj = (Alien) context.getBean("alien");
        obj.code();

        //only when the object asked then the object is intailized otherwise it is not created
        Desktop obj1 = (Desktop) context.getBean("comp2");
    }
}
  