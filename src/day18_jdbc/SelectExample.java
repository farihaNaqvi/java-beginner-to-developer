package day18_jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectExample {

    public static void main(String[] args) {

        String sql = "SELECT * FROM students";

        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " - " +
                        rs.getString("name") + " - " +
                        rs.getInt("age")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}