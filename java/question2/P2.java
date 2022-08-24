package com.prctice.java.question2;

import java.sql.*;
import java.util.Scanner;

public class P2 {
	/*
	 * This method is used to create a table of MP3 player
	 */
	public void createTable() {

		String query = "create table MP3Player(" + "SongNumber int prinmary key not null," + "SongName text not null,"
				+ "SongAuthor text not null," + "SongLanguage text not null" + ");";
		Connection connection = null;
		Statement statement = null;
		try {
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/jdbc", "postgres", "123456");

			statement = connection.createStatement();
			statement.execute(query);
			System.out.println("table created sucessfulluy");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		System.out.println("connection closed sucessfully..");
	}

	/*
	 * this method is used to modify the song from Mp3
	 */
	public void modify() {
		Scanner scanner = new Scanner(System.in);
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		String query = "select * from mp3player";
		try {

			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/jdbc", "postgres", "123456");
			statement = connection.createStatement();
			int songNumber = scanner.nextInt();
			resultSet = statement.executeQuery(query);
			if (resultSet.next()) {
				int songNumber1 = resultSet.getByte("songNumber");
				if (songNumber == songNumber1) {
					int num = 0;
					do {
						System.out.println("Enter the Eid,EName,EAge and City");
						String subquery = "insert into mp3player(songNumber,songName,songAuthor,SongLanguage)values("
								+ scanner.nextInt() + ",'" + scanner.next() + "'," + scanner.next() + ",'"
								+ scanner.next() + "');";
						statement.executeUpdate(subquery);
						System.out
								.println("press 1 to insert one more employee data \n If not then press other than 1");
						num = scanner.nextInt();
					} while (num == 1);
				}
			}
			System.out.println("song modified");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		System.out.println("connection closed sucessfully..");
	}

	/*
	 * This method is used to delete the song from mp3
	 */
	public void delete() {
		Scanner scanner = new Scanner(System.in);
		String query = "delete from MP3Player where songNumber=" + scanner.nextInt();
		Connection connection = null;
		Statement statement = null;
		try {
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/jdbc", "postgres", "123456");
			statement = connection.createStatement();
			statement.executeUpdate(query);
			System.out.println("song deleted");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		System.out.println("connection closed sucessfully..");
	}

}