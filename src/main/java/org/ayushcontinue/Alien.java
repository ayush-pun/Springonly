package org.ayushcontinue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    private int age;
    private Computer comp;

    //this is an example of the constructor injection
    @Autowired
    public Alien(Computer comp) {
        this.comp = comp;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getComp() {
        return comp;
    }

    public void setComp(Computer comp) {
        this.comp = comp;
    }

    public void code(){
        System.out.println("coding...");
        System.out.println("age : "+age);
        comp.compile();
    }
}
