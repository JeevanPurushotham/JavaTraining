package com.josh.assesment.SecondProgram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddParking {
	private final String url = "jdbc:postgresql://localhost/jdbc";
    private final String user = "postgres";
    private final String password = "123456";

    private static final String INSERT = "INSERT INTO Parking" +
            "  ( Parking_lot_Number, Parking_lot_size) VALUES " +
            " (?, ?, ?);";

    public void insertRecord() throws SQLException {
        System.out.println(INSERT);

        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT)) {
            preparedStatement.setInt(1, 2);
            preparedStatement.setString(2, "Jeevan");
            preparedStatement.setString(3, "10 slots");


            System.out.println(preparedStatement);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws SQLException {
        AddParking addParking = new AddParking();
        addParking.insertRecord();
    }
}
