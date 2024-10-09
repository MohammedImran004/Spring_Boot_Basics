package com.imran.LearnSpringFramework;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.imran.LearnSpringFramework.game.GameInterface;
import com.imran.LearnSpringFramework.game.GameRunner;
import com.imran.LearnSpringFramework.game.pacMan;
@Configuration
public class GamingConfiguration {
    @Bean
    public GameInterface game(){
        var game = new pacMan();
        return game;
    }
    @Bean
    public GameRunner gameRunner(GameInterface game){
        var gameRunner = new GameRunner(game);
        return gameRunner;
    }
}
