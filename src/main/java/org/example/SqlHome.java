package org.example;

import java.sql.*;

public class SqlHome {
    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1/new_schema", "root", "root")) {
            Statement statement = connection.createStatement();
//            statement.execute("DROP TABLE students;");
//            String sqlCommand = "CREATE TABLE NewStudents" +
//                    "(id INTEGER not NULL, " +
//                    " name VARCHAR(255), " +
//                    " age INTEGER, " +
//                    " gender VARCHAR(255), " +
//                    " number VARCHAR(255), " +
//                    " PRIMARY KEY ( id ))";
//             statement.executeUpdate(sqlCommand);
//             String insertCommand = "INSERT INTO NewStudents(id, name, age, gender, number) VALUES(1,'George',30,'male','89147721286')," +
//                     "(2,'George',30,'male','89147721286')," +
//                     "(3,'Jonh',18,'male','8999564377')," +
//                     "(4,'Marie', 55,'female','8914646464')," +
//                     "(5, 'Dasha', 19,'female','89154543343')," +
//                     "(6, 'Elizabeth', 25,'female','89136664355')," +
//                     "(7, 'Anya', 46,'female','89146346363')," +
//                     "(8, 'Nikita', 37,'male','891646636464')," +
//                     "(9, 'Alex', 21,'male','899999999')," +
//                     "(10, 'Slava', 15,'male','899898986');";
//             statement.executeUpdate(insertCommand);
              String selectCommand = "SELECT * FROM NewStudents ;";
              ResultSet resultSet = statement.executeQuery(selectCommand);

              while (resultSet.next()) {
                System.out.print(resultSet.getString(1) + " ");
                System.out.print(resultSet.getString(2) + " ");
                System.out.print(resultSet.getString(3) + " ");
                System.out.print(resultSet.getString(4) + " ");
                System.out.print(resultSet.getString(5) + " ");
                System.out.println();
            }
//            String delCommand = "Delete from NewStudents where id = 1;";
//            stmt.execute(delCommand);
       } catch (SQLException e) {
        e.printStackTrace();
        }
    }
}

