package com.jdbc.basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertTable {
    public static void main(String[] args) {
        String url ="jdbc:mysql://localhost:3306/voyatraining";
        String username="root";
        String password="root";

        try{
            Connection connection = DriverManager.getConnection(url,username,password);
            Statement statement = connection.createStatement();

            String sql ="insert into employee values('vinnet',4,'jameshdur')";

            boolean result = statement.execute(sql);
            System.out.println("Data inserted "+!result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
