package com.imran.LearnSpringFramework;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class HelloWordConfiguraation {
   @Bean
   public String name(){
    return "Hello World";
   }
}
