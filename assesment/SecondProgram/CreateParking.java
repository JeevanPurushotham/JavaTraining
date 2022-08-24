package com.josh.assesment.SecondProgram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateParking {
	private static final String createTable = "CREATE TABLE Parking " + "(Parking_lot_Number INT PRIMARY KEY ,"
			+ "Parking_lot_size VARCHAR(50), " + "  VARCHARParking_lot_availability (10))";
	
	private final String url = "jdbc:postgresql://localhost/jeevan";
	private final String user = "postgres";
	private final String password = "123456";
	public int Parking_lot_Number;
	public String Parking_lot_size;
	public String Parking_lot_availability;

	public static void main(String[] args) throws SQLException {

		CreateParking q2 = new CreateParking();
		q2.createTable();
	}

	public void createTable() throws SQLException {

		System.out.println(createTable);

		try (Connection connection = DriverManager.getConnection(url, user, password);
				Statement statement = connection.createStatement();) {
			statement.execute(createTable);
			System.out.println("Table Created Sucessfully");
			connection.close();

		} catch (SQLException e) {
			System.out.println(e);
		}

	}
}
