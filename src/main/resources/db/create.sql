DROP DATABASE  IF EXISTS ClubManager

     CREATE DATABASE ClubManager

            CREATE TABLE Admin (

                admin_id INT PRIMARY KEY AUTO_INCREMENT,
                admin_name VARCHAR(100) NOT NULL,
                admin_email VARCHAR(100) UNIQUE NOT NULL,
                admin_password VARCHAR(100) NOT NULL,
                admin_birthday DATE NOT NULL,
                admin_

            )

            CREATE TABLE Student (
                student_id INT PRIMARY KEY AUTO_INCREMENT,
                student_name VARCHAR(100) NOT NULL,
                student_email VARCHAR(100) UNIQUE NOT NULL,
                student_password VARCHAR(100) NOT NULL,
                student_birthday DATE NOT NULL,
                student_phone VARCHAR(100) NOT NULL,
                student_address VARCHAR(100) NOT NULL,
                student_gender VARCHAR(100) NOT NULL,
                
            )

            CREATE TABLE Trainer (
                trainer_id INT PRIMARY KEY AUTO_INCREMENT,
                trainer_name VARCHAR(100) NOT NULL,
                trainer_email VARCHAR(100) UNIQUE NOT NULL,
                trainer_password VARCHAR(100) NOT NULL,
                trainer_birthday DATE NOT NULL,
                trainer_phone VARCHAR(100) NOT NULL,
                trainer_address VARCHAR(100) NOT NULL,
                trainer_gender VARCHAR(100) NOT NULL,
            )

            CREATE TABLE Team (
                team_id INT PRIMARY KEY AUTO_INCREMENT,
                team_name VARCHAR(100) NOT NULL,
                team_description VARCHAR(100) NOT NULL,
                team_trainer_id INT NOT NULL,
                FOREIGN KEY (team_trainer_id) REFERENCES Trainer(trainer_id)
            )

            CREATE TABLE Grade (
                grade_id INT PRIMARY KEY AUTO_INCREMENT,
                grade_name VARCHAR(100) NOT NULL,
                grade_color VARCHAR(100) NOT NULL
            )

            CREATE TABLE Membership (
                membership_id INT PRIMARY KEY AUTO_INCREMENT,
                membership_name VARCHAR(100) NOT NULL,
                membership_price DECIMAL(10, 2) NOT NULL,
            )

            CREATE TABLE Rank (
                rank_id INT PRIMARY KEY AUTO_INCREMENT,
            )

