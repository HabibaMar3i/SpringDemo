package org.example.config;

import org.example.Alien;
import org.example.Computer;
import org.example.Desktop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
    @Bean
//    @Scope("prototype")
    public Desktop desktop(){
        return new Desktop();
    }

    @Bean
    public Alien alien(@Autowired Computer com){
        Alien obj = new Alien();
        obj.setAge(24);
        obj.setCom(com);
        return obj;
    }
}
