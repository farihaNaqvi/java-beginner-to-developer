package day18_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Day18Practice {

    public static void main(String[] args) {

        String sql = "UPDATE students SET age = ? WHERE name = ?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, 30);
            pstmt.setString(2, "Rahul");

            pstmt.executeUpdate();

            System.out.println("Record updated successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}