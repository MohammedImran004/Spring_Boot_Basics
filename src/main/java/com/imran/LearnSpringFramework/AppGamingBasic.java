package com.imran.LearnSpringFramework;
import com.imran.LearnSpringFramework.game.*;
public class AppGamingBasic {
     public static void main(String[] args) {
         var mariogame = new MarioGame();
         var gamerunner = new GameRunner(mariogame);
        gamerunner.run();
     }
}
