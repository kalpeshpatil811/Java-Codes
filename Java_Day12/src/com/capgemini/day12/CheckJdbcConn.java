package com.capgemini.day12;

import java.sql.*;

public class CheckJdbcConn {

	public static void main(String[] args) {
		Connection c = null;
		try {
			Class.forName("org.postgresql.Driver");
			c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/employee", "postgres", "root");
			System.out.println("Connected Successfully");
			Statement st = c.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM public.employee");
			while (rs.next()) {
				System.out.print("Employee No: " + rs.getInt(1) + " ");
				System.out.print("Employee Name: " + rs.getString(2) + " ");
				System.out.print("Employee Email: " + rs.getString(5) + " ");
				System.out.println();
			}
			if (c != null) {
				rs.close();
				st.close();
				c.close();
				System.out.println("Closed Database successfully");
			}
		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
	}

}
