package com.josh.java.training.jdbc.crudoperation;



	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;

	public class DeleteTable {
	    private static final String DELETE_USERS_SQL = "delete from users where id = ?;";
	    private final String url = "jdbc:postgresql://localhost/jdbc";
	    private final String user = "postgres";
	    private final String password = "123456";

	    Connection connection;
	    public void deleteRecord() throws SQLException {
	        System.out.println(DELETE_USERS_SQL);
	        try { connection = DriverManager.getConnection(url, user, password);

	            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_USERS_SQL); {
	            preparedStatement.setInt(1, 1);
	            int result = preparedStatement.executeUpdate();
	            System.out.println("Number of records affected : " + result);}}
	            catch (SQLException e) {
	            System.out.println(e);
	        }
	    }
	    public    void  closeConnection(){
	        try {
	            if (connection != null) { connection.close(); }
	        }
	        catch (Exception e) {
	            System.out.println(e);
	        }
	    }
	    public static void main(String[] args) throws SQLException {
	        DeleteTable delete = new DeleteTable();
	        delete.deleteRecord();
	        delete.closeConnection();
	    }

}
