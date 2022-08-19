package com.josh.java.Training.jdbc.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementDemo {

	public static void main(String[] args) {
		String url = "jdbc:postgresql://localhost:5432/Jeevan";
		String user = "postgres";
		String password = "123456";
		String query = "INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS) VALUES(?,?,?,?);";
		Connection connection = null;
		Scanner sc = null;
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			connection = DriverManager.getConnection(url, user, password);
			PreparedStatement ps = connection.prepareStatement(query);
			sc = new Scanner(System.in);
			int num = 0;
			do {
				System.out.println("Enter Id : ");
				int id = sc.nextInt();
				System.out.println("Enter name : ");
				String name = sc.next();
				System.out.println("Enter age : ");
				int age = sc.nextInt();
				System.out.println("Enter addres : ");
				String address = sc.next();
				ps.setInt(1, id);
				ps.setString(2, name);
				ps.setInt(3, age);
				ps.setString(4, address);
				ps.executeUpdate();
				System.out.println("Enter 1 for Another data");
				num = sc.nextInt();
			} while (num == 1);
			System.out.println("Data Added");
			System.out.println("you need all data press 2 ");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (connection != null) {
					connection.close();
					sc.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
