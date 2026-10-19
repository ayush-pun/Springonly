package org.ayushcontinue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    private int age;
    private Computer comp;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getComp() {
        return comp;
    }

    @Autowired
    //here we have done the setter injection the object is injected by the spring
    public void setComp(Computer comp) {
        this.comp = comp;
    }

    public void code(){
        System.out.println("coding...");
        System.out.println("age : "+age);
        comp.compile();
    }
}
