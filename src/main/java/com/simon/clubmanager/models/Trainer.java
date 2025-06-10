package com.simon.clubmanager.models;

import java.time.LocalDate;
import java.util.List;

public class Trainer extends User{

    private List<Team> teams;
    private String rank;

    public Trainer(String mail, String name, String password, LocalDate birthday, Grade grade,String rank, List<Team> teams) {
        super(mail, name, password, birthday, grade);
        this.rank = rank;
        this.teams = teams;
    }
}
