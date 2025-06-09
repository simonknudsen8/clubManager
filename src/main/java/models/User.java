package models;

import java.time.LocalDate;

public class User {

    private String mail;
    private String name;
    private String password;
    private LocalDate birthday;
    private Grade grade;

    public User(String mail, String name, String password, LocalDate birthday, Grade grade) {
        this.mail = mail;
        this.name = name;
        this.password = password;
        this.birthday = birthday;
        this.grade = grade;
    }
}
