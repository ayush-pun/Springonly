package org.ayushcontinue;

public class Alien {

    int age;
    private Laptop lap;

    public Alien(){
        System.out.println("alien object created ...");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("age setter called....");
        this.age = age;
    }

    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        System.out.println("laptop setter called...");
        this.lap = lap;
    }

    public void code(){
        System.out.println("coding .....");
    }
}
