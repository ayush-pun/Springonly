package org.ayushcontinue;

public class Alien {

    int age;

    public Alien(){
        System.out.println("object created ...");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("setter called....");
        this.age = age;
    }

    public void code(){
        System.out.println("coding .....");
    }
}
