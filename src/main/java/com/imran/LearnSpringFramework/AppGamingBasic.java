package com.imran.LearnSpringFramework;
import com.imran.LearnSpringFramework.game.GameInterface;
import com.imran.LearnSpringFramework.game.GameRunner;
import com.imran.LearnSpringFramework.game.MarioGame;
import com.imran.LearnSpringFramework.game.pacMan;
public class AppGamingBasic {
     public static void main(String[] args) {
       
         var mariogame = new MarioGame();
         var pacman = new  pacMan();
         var gamerunner = new GameRunner(pacman);
        gamerunner.run();
     }
}
