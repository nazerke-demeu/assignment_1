package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Team team = context.getBean(Team.class);

        System.out.println("Team: " + team.getTeamName());
        System.out.println("Player: " + team.getPlayer().getName() +
                " (№" + team.getPlayer().getNumber() + ", " + team.getPlayer().getPosition() + ")");
    }
}
