package com.simon.clubmanager.models;

import java.time.LocalDate;

public class User {

    private String mail;
    private String name;
    private String password;
    private LocalDate birthday;
    private Grade grade;

    public User() {
        // No-args constructor
    }

    public User(String mail, String name, String password, LocalDate birthday, Grade grade) {
        this.mail = mail;
        this.name = name;
        this.password = password;
        this.birthday = birthday;
        this.grade = grade;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }
}
