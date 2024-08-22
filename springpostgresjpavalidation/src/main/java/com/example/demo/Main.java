package com.example.demo;
public class Main {
    public static void main(String[] args) {
        UserDAO userDAO = new UserDAO();
        User newUser = new User("John Doe", "john.doe@example.com");

        userDAO.addUser(newUser);
    }
}

