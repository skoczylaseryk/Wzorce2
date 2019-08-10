package com.itersive.sda.patterns.structural.composite;

import java.util.List;
import java.util.stream.Collectors;

public class Project implements Team {
    private List<Team> teams;

    public Project(List<Team> teams) {
        this.teams = teams;
    }

    @Override
    public String getName() {
        return teams.stream().map(Team::getName).collect(Collectors.joining("\n"));
    }

    public void addTeam(Team team) {
        teams.add(team);
    }

    public void removeTeam(Team team) {
        teams.remove(team);
    }
}
