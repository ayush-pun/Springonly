package org.ayushcontinue;

public class Alien {

    private int age;
    private Laptop lap;

    public Alien(){
        System.out.println("alien object created ...");
    }

    public Alien(int age, Laptop lap) {
        System.out.println("parameterized constructor called......");
        this.age = age;
        this.lap = lap;
    }

    public void code(){
        System.out.println("coding...");
        System.out.println("age : "+age);
        lap.compile();
    }
}
