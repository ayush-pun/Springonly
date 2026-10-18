package org.ayushcontinue;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
       Desktop dt = context.getBean("desktop",Desktop.class);
       Desktop dt1 = context.getBean("desktop", Desktop.class);
       //this will prints true since the object is same as its scope is singleton
       System.out.println(dt == dt1);

       Desktop dt2 = context.getBean("desktop1",Desktop.class);
       Desktop dt3 = context.getBean("desktop1", Desktop.class);
        //this will prints false is the object is different each time it is created as its scope is prototype
       System.out.println(dt2 == dt3);
    }
}
/*the output is :
Desktop object is created.....
true
Desktop object is created.....
Desktop object is created.....
false
*/