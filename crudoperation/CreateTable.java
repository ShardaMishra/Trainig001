package com.josh.java.training.jdbc.crudoperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

	private final String url = "jdbc:postgresql://localhost/jdbc";
	private final String user = "postgres";
	private final String password = "123456";

	private static final String createTableSQL = "CREATE TABLE users " + "(ID INT PRIMARY KEY ," + " NAME TEXT, "
			+ " EMAIL VARCHAR(50), " + " COUNTRY VARCHAR(50), " + " PASSWORD VARCHAR(50))";

	public void createTable() throws SQLException {

		System.out.println(createTableSQL);

		try (Connection connection = DriverManager.getConnection(url, user, password);
				Statement statement = connection.createStatement();) {
			statement.execute(createTableSQL);
			System.out.println("Table Created Sucessfully");
			connection.close();

		} catch (SQLException e) {
			System.out.println(e);
		}

	}

	public static void main(String[] args) throws SQLException {
		CreateTable create = new CreateTable();
		create.createTable();
	}

}
