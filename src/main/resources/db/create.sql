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