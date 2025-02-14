package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "org.example")
public class ProjectConfig {

    @Bean
    @Primary
    Player judeBellingham() {
        Player player = new Player();
        player.setName("Jude Bellingham");
        player.setNumber(5);
        player.setPosition("Midfielder");
        return player;
    }

    @Bean
    Player viniciusJunior() {
        Player player = new Player();
        player.setName("Vinicius Junior");
        player.setNumber(7);
        player.setPosition("Winger");
        return player;
    }

    @Bean
    @Primary
    Team realMadrid() {
        Team team = new Team();
        team.setTeamName("Real Madrid");
//        team.setPlayer(judeBellingham());
        return team;
    }

    @Bean
    Team barcelona() {
        Team team = new Team();
        team.setTeamName("Real Madrid");
//        team.setPlayer(viniciusJunior());
        return team;
    }
}
