package com.imran.LearnSpringFramework;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
record Person(String name,int age){};
record Address(String city , String State){};
@Configuration
public class HelloWordConfiguraation {
   @Bean
   public String name(){
    return "Hello World";
   }
   @Bean
   public int age(){
    return 15;
   }
   @Bean
   public Person person(){
      return new Person("Imran",23);
   }
   @Bean
   public Address address(){
      return new Address("Lahore","Punjab");
   }
}
