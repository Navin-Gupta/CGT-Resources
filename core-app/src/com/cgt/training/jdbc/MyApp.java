package com.cgt.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Savepoint;
import java.sql.Statement;



public class MyApp {

	public static void main(String args[]) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/studentdb", "root", "");
			// Statement stmt = conn.createStatement();
			
			Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			
			PreparedStatement pstmt = conn.prepareStatement("select * from student where name=?")
			
			
			ResultSet rs = stmt.executeQuery("select * from student"); // select  : readonly : forward only
			
			
			// pstmt.setString(0, "");
			// pstmt.setBlob(1, );
			
			
			// DMQ
			stmt.addBatch("");
			stmt.addBatch("");
			stmt.addBatch("");
			stmt.addBatch("");
			stmt.addBatch("");
			
			int []arr = stmt.executeBatch();

			stmt.clearBatch();
			
			
			// Transaction
			
			Savepoint sp = null;
			try {
				conn.setAutoCommit(false);
				
				stmt.executeUpdate("");
				stmt.executeUpdate("");
				stmt.executeUpdate("");
				sp = conn.setSavepoint();
				
				stmt.executeUpdate("");
				stmt.executeUpdate("");
				
				conn.commit();
			}
			catch(Exception ex) {
				if(sp !=null) {
					conn.rollback(sp);
					conn.commit();
				}
				else
					conn.rollback();
				
			}
			finally {
				conn.setAutoCommit(true);
			}
			
			
			
			
			
			
			/*rs.next();
			rs.previous();
			rs.last();
			rs.first();
			rs.beforeFirst();
			rs.afterLast();
			rs.absolute(4);
			rs.relative(-2);
			*/
			
			/*rs.updateString(1, "");
			rs.updateString(1, "");
			rs.updateString(1, "");
			rs.updateString(1, "");
			rs.updateRow();
			rs.refreshRow();
			
			rs.deleteRow();
			rs.refreshRow();
			
			// rs.getRow()
			
			rs.insertRow();
			rs.moveToInsertRow();
			rs.updateString(1, "");
			rs.updateString(1, "");
			rs.updateString(1, "");
			rs.updateRow();
			rs.refreshRow();
			rs.moveToCurrentRow();
			*/
			
			
			
			/*if(rs.next()) {
				String str = rs.getString(1);
				String str1 = rs.getString("username");
			}*/
			while(rs.next()) {
				System.out.println(rs.getString(2) + " | " + rs.getString(3));
			}
			
			// int n = stmt.executeUpdate(""); // DMQ
			
			
			// n : number of rows affected
			
			conn.close();
			
			
		}
		catch(Exception ex) {
			
		}
	}
}
