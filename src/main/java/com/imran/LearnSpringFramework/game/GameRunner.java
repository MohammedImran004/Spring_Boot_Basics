package com.imran.LearnSpringFramework.game;

public class GameRunner {
    MarioGame game;
    public GameRunner(MarioGame game){
        this.game = game;
    }
    public void run(){
        System.out.println("Runnning game "+ game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
