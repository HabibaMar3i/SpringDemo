package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.beans.ConstructorProperties;
@Component
public class Alien{
    @Value("25")
    private int age;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        System.out.println("age setter called");
        this.age = age;
    }
    //    private Laptop lap = new Laptop();
    @Autowired
    @Qualifier("desktop")
    private Computer com;
    public Computer getCom() {
        return com;
    }
    public void setCom(Computer com) {
        this.com = com;
    }
    @ConstructorProperties({"age", "lap"})
    public Alien(int age, Computer com) {
        this.age = age;
        this.com = com;
    }

    public Alien(){
        System.out.println("Alien object created");
    }
    public void code(){
        System.out.println("Coding..");
        com.compile();
    }
}
