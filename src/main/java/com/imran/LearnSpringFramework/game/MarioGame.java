package com.imran.LearnSpringFramework.game;

public class MarioGame implements GameInterface {
    @Override
    public void up(){
        System.out.println("Jump");
    }
    @Override
    public void down(){
        System.out.println("Fall");
    }
    @Override
    public void left(){
        System.out.println("Move Left");
    }
    @Override
    public void right(){
        System.out.println("Move Right");
    }
}
