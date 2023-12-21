package es2;

import java.sql.*;

public class Main {
    public static void main(String[] args) {

        Connection connection;
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb", "developer", "Newdivide");
            Statement statement = connection.createStatement();

            String createTab = "CREATE TABLE `newdb`.`students` (" +
                    " `id_student` INT NOT NULL AUTO_INCREMENT," +
                    "`first_name` VARCHAR(30)," +
                    "`last_name` VARCHAR(30)," +
                    "PRIMARY KEY (`id_student`))";

            statement.executeUpdate(createTab);

            String stud1 = "INSERT INTO `students` (`id_student`, `first_name`, `last_name`) VALUES (1, 'Luca', 'Savini')";
            String stud2 = "INSERT INTO `students` (`id_student`, `first_name`, `last_name`) VALUES (2, 'Andrea', 'Lirosi')";
            String stud3 = "INSERT INTO `students` (`id_student`, `first_name`, `last_name`) VALUES (3, 'Andrea', 'Monizza')";
            String stud4 = "INSERT INTO `students` (`id_student`, `first_name`, `last_name`) VALUES (4, 'Antonio', 'Iovine')";

            statement.executeUpdate(stud1);
            statement.executeUpdate(stud2);
            statement.executeUpdate(stud3);
            statement.executeUpdate(stud4);

            ResultSet resultSet = statement.executeQuery("select * from students");
            while(resultSet.next()){
                System.out.println(resultSet.getString("first_name") +" " +
                        resultSet.getString("last_name"));
            }
        }
        catch (SQLException e ){
            System.out.println((e.getMessage()));
        }
    }
}