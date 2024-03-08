package com.jdbc.prepared;

import java.sql.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class PreSelectPlace {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/voyatraining";
        String username = "root";
        String password = "root";
        String sql = "select * from cab  where drop_loc=?";

        try (
                Connection connection = DriverManager.getConnection(url, username, password);
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                Scanner sc = new Scanner(System.in);
        ) {
            System.out.println("Enter drop location");
            String droploc = sc.next();
            preparedStatement.setString(1, droploc);
            try (
                    ResultSet resultSet = preparedStatement.executeQuery();

            ){
                while(resultSet.next()) {
                    int cab_number = resultSet.getInt("cab_number");
                    String drop_loc = resultSet.getString("drop_loc");
                    String pickup_loc = resultSet.getString("pickup_loc");

                    Time time =  resultSet.getTime("pickup_time");
                    LocalTime pickup_time =  LocalTime.parse(time.toString());

                    LocalDate pickup_date = LocalDate.parse(resultSet.getDate("pickup_date").toString());

                    String driver_name = resultSet.getString("driver_name");

                    System.out.println(cab_number+"\t"+drop_loc+"\t"+pickup_loc+"\t"+pickup_time+"\t"+pickup_date+"\t"+driver_name);
                }

        } catch(Exception e) {
                e.printStackTrace();
            }
    } catch(
    Exception e) {
        e.printStackTrace();
    }
}
}
