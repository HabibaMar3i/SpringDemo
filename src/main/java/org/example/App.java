package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
//        Alien obj = new Alien();
//        obj.code();
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Alien obj = (Alien) context.getBean("alien");
        obj.code();
        obj.age = 22;
        System.out.println(obj.age);

        Alien obj1 = (Alien) context.getBean("alien");
        obj1.code();
        System.out.println(obj1.age);

    }
}
