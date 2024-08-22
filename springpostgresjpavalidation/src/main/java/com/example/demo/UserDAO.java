package com.example.demo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDAO {
    private static final String URL = "jdbc:postgresql://localhost:5432/spring";
    private static final String USER = "postgres";
    private static final String PASSWORD = "Chem@blue1";

    public void addUser(User user) {
        String sql = "INSERT INTO users (name, email) VALUES (?, ?)";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, user.getName());
            pstmt.setString(2, user.getEmail());

            pstmt.executeUpdate();
            System.out.println("User added successfully!");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

