package com.josh.java.training.jdbc.crudoperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertTable {
	private final String url = "jdbc:postgresql://localhost/jdbc";
	private final String user = "postgres";
	private final String password = "123456";

	private static final String INSERT_USERS_SQL = "INSERT INTO users"
			+ "  (id, name, email, country, password) VALUES " + " (?, ?, ?, ?, ?);";

	public void insertRecord() throws SQLException {
		System.out.println(INSERT_USERS_SQL);

		try (Connection connection = DriverManager.getConnection(url, user, password);
				PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
			preparedStatement.setInt(1, 2);
			preparedStatement.setString(2, "akash");
			preparedStatement.setString(3, "akash@gmail.com");
			preparedStatement.setString(4, "india");
			preparedStatement.setString(5, "akash@1907");

			System.out.println(preparedStatement);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) throws SQLException {
		InsertTable insert = new InsertTable();
		insert.insertRecord();
	}

}
