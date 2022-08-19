package com.josh.java.training.jdbc.crudoperation;

import java.sql.*;

public class SelectTable {
	private final static String url = "jdbc:postgresql://localhost/jdbc";
	private final static String user = "postgres";
	private final static String password = "123456";

	private static final String QUERY = "select id,name,email,country,password from Users where id =?";
	private static final String SELECT_ALL_QUERY = "select * from users";

	public void getUserById() {
		try (Connection connection = DriverManager.getConnection(url, user, password);
				PreparedStatement preparedStatement = connection.prepareStatement(QUERY);) {
			preparedStatement.setInt(1, 1);
			System.out.println(preparedStatement);
			ResultSet rs = preparedStatement.executeQuery();

			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String email = rs.getString("email");
				String country = rs.getString("country");
				String password = rs.getString("password");
				System.out.println(id + "," + name + "," + email + "," + country + "," + password);
			}
		} catch (SQLException e) {
			System.out.println(e);
		}
	}

	public void getAllUsers() {

		try (Connection connection = DriverManager.getConnection(url, user, password);
				PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_QUERY);) {
			System.out.println(preparedStatement);
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String email = rs.getString("email");
				String country = rs.getString("country");
				String password = rs.getString("password");
				System.out.println(id + "," + name + "," + email + "," + country + "," + password);
			}
		} catch (SQLException e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		SelectTable select = new SelectTable();
		select.getUserById();
		select.getAllUsers();
	}

}
