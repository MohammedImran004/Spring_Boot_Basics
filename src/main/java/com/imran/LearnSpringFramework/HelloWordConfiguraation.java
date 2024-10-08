package com.imran.LearnSpringFramework;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
record Person(String name,int age,Address address){};
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
      return new Person("Imran",23,new Address("MainStreet", "Tamilnadu"));
   }
   @Bean (name = "address2")
   public Address address(){
      return new Address("Lahore","Punjab");
   }
   @Bean
   public Person person2MethodCall(){
      return new Person(name(),age(),address());
   }
   @Bean
   public Person person2Parameters(String name, int age , Address address2){
      return new Person(name , age , address2);
   }

}
