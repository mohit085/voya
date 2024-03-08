package com.jdbc.prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Time;
import java.sql.Date;
import java.util.Scanner;

public class PreInsert {
    public static void main(String[] args) {
        String url ="jdbc:mysql://localhost:3306/voyatraining";
        String username="root";
        String password="root";

        String sql = "insert into cab values(?,?,?,?,?,?)";
        try(
                Connection connection = DriverManager.getConnection(url,username,password);
                PreparedStatement statement = connection.prepareStatement(sql);
                Scanner sc = new Scanner(System.in);

                ) {

            for (int i = 0; i < 5; i++) {
                int cab_number = sc.nextInt();
                String drop_loc = sc.next();
                String pickup_loc = sc.next();
                String pickup_time = sc.next();  //"16:00:00";
                String pickup_date = sc.next();  //"2024-03-07";
                String driver_name = sc.next();


                //assign values to placeholders
                statement.setInt(1,cab_number);
                statement.setString(2,drop_loc);
                statement.setString(3,pickup_loc);
                statement.setTime(4, Time.valueOf(pickup_time));
                statement.setDate(5,Date.valueOf(pickup_date));
                statement.setString(6,driver_name);

                statement.execute();

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
