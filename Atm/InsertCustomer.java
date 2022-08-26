package com.josh.miniproject.atm.Atm;

import java.sql.*;
import java.util.Scanner;

public class InsertCustomer {
    public static int insert() {
        Connection connection = null;
        Scanner Input = null;
        ResultSet rs = null;
        int cid = 0;
        Scanner scanner = new Scanner(System.in);
        try {
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Jeevan", "postgres", "123456");
            Statement statement = connection.createStatement();
            //using statement reference we are calling executeQuery for run the query.
            rs = statement.executeQuery("select max(cid) from cdata");
            Input = new Scanner(System.in);
            //This loop used for retrieving the data present in the database.
            if (rs.next()) {
                cid = rs.getInt(1) + 1;
            } else {
                System.out.println("Invalid");
            }
            System.out.println("Enter Name, Pin, Amount :");
            String cname = Input.nextLine();
            int pin = Input.nextInt();
            double amount = Input.nextDouble();
            //PreparedStatement used to store the data in dynamically in run time.
            PreparedStatement pstmt = connection.prepareStatement("insert into cdata(cid,cname,pin,amount) values(?,?,?,?);");
            pstmt.setInt(1, cid);
            pstmt.setString(2, cname);
            pstmt.setInt(3, pin);
            pstmt.setDouble(4, amount);
            pstmt.executeUpdate();
            System.out.println("Data added");
        } catch (SQLException e) {
            e.getMessage();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
        return cid;
    }
}
