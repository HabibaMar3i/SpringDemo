package org.example;

import org.example.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
//        Alien obj = new Alien();
//        obj.code();
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        Alien obj = (Alien) context.getBean("alien");
//        obj.code();
//        obj.age = 22;
//        System.out.println(obj.getAge());

//        Alien obj1 = (Alien) context.getBean("alien");
//        obj1.code();
//        System.out.println(obj1.age);
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

//        Desktop dt = context.getBean("desktop", Desktop.class);
//        dt.compile();
//
//        Desktop dt1 = context.getBean("desktop", Desktop.class);
//        dt.compile();

        Alien obj = context.getBean(Alien.class);
        System.out.println(obj.getAge());
        obj.code();
    }
}
