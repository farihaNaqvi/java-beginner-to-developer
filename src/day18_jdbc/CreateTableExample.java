package day18_jdbc;

import java.sql.Connection;
import java.sql.Statement;

public class CreateTableExample {

    public static void main(String[] args) {

        String sql = "CREATE TABLE IF NOT EXISTS students (" +
                "id INT PRIMARY KEY AUTO_INCREMENT," +
                "name VARCHAR(100)," +
                "age INT)";

        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement()) {

            stmt.execute(sql);
            System.out.println("Table created successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}