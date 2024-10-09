package com.imran.LearnSpringFramework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.imran.LearnSpringFramework.game.GameInterface;
import com.imran.LearnSpringFramework.game.GameRunner;
 
public class App03GamingSpringBeans {
    public static void main(String[] args) {
        try (var contex = new  AnnotationConfigApplicationContext(GamingConfiguration.class)){
            
            contex.getBean(GameInterface.class).up();
            contex.getBean(GameRunner.class).run();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
       
    }
}
