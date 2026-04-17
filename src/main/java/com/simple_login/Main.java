package com.simple_login;

public class Main {

    public static void main(String[] args) {

        // 1. Create an instance of our data (The users list)
        IdAndPasswords idAndPasswords = new IdAndPasswords();
        
        // 2. Pass the data to the Login Page and open it
        new LoginPage(idAndPasswords.getLoginInfo());
        
    }
}