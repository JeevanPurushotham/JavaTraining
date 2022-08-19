package com.josh.java.Training.jdbc.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*delete some data inside the company database table*/
public class Delete {

	public static void main(String[] args) {
		String url = "jdbc:postgresql://localhost:5432/Jeevan";
		String user = "postgres";
		String password = "123456";
		String query = "DELETE from company where id=1";

		Connection connection = null;

		try {
			connection = DriverManager.getConnection(url, user, password);
			Statement statement = connection.createStatement();
			statement.execute(query);
			System.out.println("Deleted");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
