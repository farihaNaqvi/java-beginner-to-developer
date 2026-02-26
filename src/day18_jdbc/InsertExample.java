package day18_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class InsertExample {

    public static void main(String[] args) {

        String sql = "INSERT INTO students (name, age) VALUES (?, ?)";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, "Rahul");
            pstmt.setInt(2, 25);

            pstmt.executeUpdate();

            System.out.println("Data inserted successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}