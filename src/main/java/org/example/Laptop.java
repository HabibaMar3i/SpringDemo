package org.example;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer{
    public Laptop(){
        System.out.println("Laptop object created");
    }
    public void compile(){
        System.out.println("Compiling as laptop...");
    }
}
