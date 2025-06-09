package models;

import java.time.LocalDate;

public class Admin extends User{


    public Admin(String mail, String name, String password, LocalDate birthday, Grade grade) {
        super(mail, name, password, birthday, grade);
    }
}
