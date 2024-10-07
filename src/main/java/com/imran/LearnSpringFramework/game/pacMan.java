package com.imran.LearnSpringFramework.game;
public class pacMan implements GameInterface {
    public void up(){
        System.out.println("Jump");
    }
    public void down(){
        System.out.println("Fall");
    }
    public void left(){
        System.out.println("Move Left");
    }
    public void right(){
        System.out.println("Move Right");
    }
}
