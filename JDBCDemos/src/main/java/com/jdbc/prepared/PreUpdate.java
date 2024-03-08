package com.jdbc.prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PreUpdate {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/voyatraining";
        String username = "root";
        String password = "root";

        String sql = "update cab set driver_name=? where cab_number=?";

        try (
                Connection connection = DriverManager.getConnection(url, username, password);
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                Scanner sc = new Scanner(System.in);
        ) {
//            for (int i = 0; i < 5; i++) {
                System.out.println("Enter driver name");
                String driver_name = sc.next();
                System.out.println("enter cab number");
                int cab_number = sc.nextInt();

                preparedStatement.setString(1,driver_name);
                preparedStatement.setInt(2,cab_number);

                boolean res = preparedStatement.execute();
                System.out.println(res);
//            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
