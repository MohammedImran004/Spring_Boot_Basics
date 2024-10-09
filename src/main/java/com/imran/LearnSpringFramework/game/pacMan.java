package com.imran.LearnSpringFramework.game;
public class pacMan implements GameInterface {

    public pacMan() {
    }
    @Override
    public String up(){
        System.out.println("Jump");
        return "Jump";
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
