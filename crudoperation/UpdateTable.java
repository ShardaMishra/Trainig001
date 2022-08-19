package com.josh.java.training.jdbc.crudoperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateTable {
	private final String url = "jdbc:postgresql://localhost/jdbc";
	private final String user = "postgres";
	private final String password = "123456";
	private static final String UPDATE_USERS_SQL = "update users set name = ? where id = ?;";

	public void updateRecord() throws SQLException {
		System.out.println(UPDATE_USERS_SQL);
		try (Connection connection = DriverManager.getConnection(url, user, password);
				PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_USERS_SQL)) {
			preparedStatement.setString(1, "rashid");
			preparedStatement.setInt(2, 1);
			preparedStatement.executeUpdate();
			System.out.println(preparedStatement);
			System.out.println("updated sucessfully");
		} catch (SQLException e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) throws SQLException {
		UpdateTable update = new UpdateTable();
		update.updateRecord();
	}

}
