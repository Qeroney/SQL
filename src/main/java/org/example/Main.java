package org.example;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1/new_schema", "root", "root")) {
            Statement stmt = connection.createStatement();
//            String sqlCommand = "CREATE TABLE animal" +
//                    "(id INTEGER not NULL, " +
//                    " name VARCHAR(255), " +
//                    " kind VARCHAR(255), " +
//                    " age INTEGER, " +
//                    " PRIMARY KEY ( id ))";
//            stmt.executeUpdate(sqlCommand);
//            String insertCommand = "INSERT INTO animal(id, name, kind, age) VALUES(7, 'Fish', 'sturgeon',5);";
//            int i = stmt.executeUpdate(insertCommand);
//            System.out.println("Успешно применена " + i + " строка");
              String selectCommand = "SELECT * FROM animal ;";
              ResultSet resultSet = stmt.executeQuery(selectCommand);
//            System.out.println(resultSet.toString());


            while (resultSet.next()){
                System.out.print(resultSet.getString(1) + " ");
                System.out.print(resultSet.getString(2) + " ");
                System.out.print(resultSet.getString(3) + " ");
                System.out.print(resultSet.getString(4) + " ");
                System.out.println();
            }
//            String delCommand = "Delete from animal where id = 7;";
//            stmt.execute(delCommand);
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

