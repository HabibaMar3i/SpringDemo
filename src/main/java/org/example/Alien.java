package org.example;

public class Alien {
    private int age;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        System.out.println("age setter called");
        this.age = age;
    }
    //    private Laptop lap = new Laptop();
    private Laptop lap;
    public Laptop getLap() {
        return lap;
    }
    public void setLap(Laptop lap) {
        System.out.println("lap setter called");
        this.lap = lap;
    }
    public Alien(){
        System.out.println("Alien object created");
    }
    public void code(){
        System.out.println("Coding..");
        lap.compile();
    }

}
