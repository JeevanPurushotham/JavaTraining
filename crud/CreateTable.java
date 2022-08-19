package com.josh.java.Training.jdbc.crud;

import java.sql.*;

/*creating table inside the database*/
public class CreateTable {

	public static void main(String[] args) {
		String url = "jdbc:postgresql://localhost:5432/Jeevan";
		String user = "postgres";
		String password = "123456";
		String query = "CREATE TABLE COMPANY(\r\n" + "ID INT PRIMARY KEY NOT NULL,\r\n" + "NAME TEXT NOT NULL,\r\n"
				+ "AGE INT NOT NULL,\r\n" + "ADDRESS CHAR(50),\r\n" + "SALARY REAL,\r\n" + "JOIN_DATE	DATE\r\n"
				+ ");";
		Connection connection = null;
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		try {
			connection = DriverManager.getConnection(url, user, password);
			Statement statement = connection.createStatement();
			statement.execute(query);
			System.out.println("created");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
