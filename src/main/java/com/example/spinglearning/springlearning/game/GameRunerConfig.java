package com.example.spinglearning.springlearning.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.spinglearning.springlearning.game")
public class GameRunerConfig {
    public static void main(String[] args) {

		try (var context = 
				new AnnotationConfigApplicationContext
					(GameRunerConfig.class)) {

			context.getBean(GamingConsole.class).up();
			
			context.getBean(GameRunner.class).run();

		}
	}
}
