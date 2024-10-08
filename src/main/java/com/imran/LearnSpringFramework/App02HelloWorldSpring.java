package com.imran.LearnSpringFramework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
    public static void main(String[] args) {
        //1 : launch a spring Context
        var context = new AnnotationConfigApplicationContext(HelloWordConfiguraation.class);
        //2 : Configure the things that we want Spring to manage - @Configuration
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
        // System.out.println(context.getBean("person.age"));
        System.out.println(context.getBean("address"));
        Person person = (Person) context.getBean("person");
        System.out.println(person.age());
    }
}
