package JDBC;

import java.sql.*;
import java.util.Scanner;

public class jdbc{
    public static void main(String args[]) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/users", "Shreyansh", "Shreyansh631");
            Statement statement = connection.createStatement();
            System.out.print("Enter query: ");
            Scanner scan = new Scanner(System.in);
            String query = scan.nextLine();
            ResultSet result = statement.executeQuery(query);
            while (result.next()) {
                System.out.println(result.getString("user_maincol"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}