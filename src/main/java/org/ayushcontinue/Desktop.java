package org.ayushcontinue;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//this annotation declares that this class should be managed spring when component scanning is enabled spring discovers
//desktop and register it as a bean and by default it is singleton
@Component
//here we have made the scope of the desktop class as prototype which means a new object pre request
@Scope("prototype")
public class Desktop implements Computer{

    public Desktop(){
        System.out.println("Desktop object is created.....");
    }
    @Override
    public void compile() {
        System.out.println("compiling in desktop.......");
    }
}
