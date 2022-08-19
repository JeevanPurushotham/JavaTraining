package com.josh.java.Training.jdbc.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*Insert some data inside the company database table*/
public class Insert {

	public static void main(String[] args) {
		String url = "jdbc:postgresql://localhost:5432/Jeevan";
		String user = "postgres";
		String password = "123456";
		String queryInsert = "INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,JOIN_DATE) VALUES (8, 'Allen', 25, 'Texas', '2007-12-13');";
		String queryInsertOne = "INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,JOIN_DATE) VALUES (9, 'Ani', 23, 'Dubai', '2022-06-11');";
		String query = "SELECT * from company;";
		Connection connection = null;
		ResultSet rs = null;

		try {
			connection = DriverManager.getConnection(url, user, password);
			Statement statement = connection.createStatement();
			statement.execute(queryInsert);
			statement.execute(queryInsertOne);
			System.out.println("Inserted");
			rs = statement.executeQuery(query);
			while (rs.next()) {
				// Display values
				System.out.print("ID: " + rs.getInt("id"));
				System.out.print(", Name : " + rs.getString("name"));
				System.out.print(", age: " + rs.getInt("age"));
				System.out.println(", address: " + rs.getString("address"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (connection != null) {
					rs.close();
					connection.close();
				}
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}

/*
 * output--> Inserted 
 * ID: 2, Name : Allen, age: 25, address: Texas 
 * :ID: 3, Name : Ani, age: 23, address: Dubai
 */
