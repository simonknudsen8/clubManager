package models;

import java.util.List;

public class Team {

    private String name;
    private List<Student> students;
    private Trainer trainer;

    public Team(String name, List<Student> students, Trainer trainer) {
        this.name = name;
        this.students = students;
        this.trainer = trainer;
    }
}
