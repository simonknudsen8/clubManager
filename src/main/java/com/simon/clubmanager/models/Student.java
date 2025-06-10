package com.simon.clubmanager.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Student extends User{

    private List<Team> team = new ArrayList<>();

    public Student(String mail, String name, String password, LocalDate birthday, Grade grade) {
        super(mail, name, password, birthday, grade);
    }
}
