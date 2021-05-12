package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import db.DB;

public class Program {

	public static void main(String[] args) {

//		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Connection conn = null;
//		DB.closeConnection();
//		Statement st = null;
//		ResultSet rs = null;
		PreparedStatement pst = null;
//
//		// ---------------------------fazendo consultas ao banco de dados-------------------------------
//
//		try {
//			conn = DB.getConnection();
//			st = conn.createStatement();
//			rs = st.executeQuery("select * from department");
//
//			while (rs.next()) {
//				System.out.println(rs.getInt("id") + ", " + rs.getString("name"));
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			DB.closeResultSet(rs);
//			DB.closeStatement(st);
//			DB.closeConnection();
//		}
		
		// ----------------------------------Inserindo dados na tabela------------------------------
		
//		try {
//			conn = DB.getConnection();
//			pst = conn.prepareStatement(
//					"Insert into seller "
//					+ "(Name, Email, BirthDate, BaseSalary, DepartmentId) "
//					+ "VALUES"
//					+ "(?, ?, ?, ?, ?)",
//					Statement.RETURN_GENERATED_KEYS);
//			
//			pst.setString(1, "Carl Puple");
//			pst.setString(2, "carl@gmail.com");
//			pst.setDate(3, new java.sql.Date(sdf.parse("22/04/1995").getTime()));
//			pst.setDouble(4, 3000.0);
//			pst.setInt(5, 4);
			
//			pst = conn.prepareStatement("insert into department (name) values ('D1'), ('D2')",
//					Statement.RETURN_GENERATED_KEYS);
//			
//			int rowsAffected = pst.executeUpdate();
//			if (rowsAffected > 0) {
//				ResultSet rs = pst.getGeneratedKeys();
//				while (rs.next()) {
//					int id = rs.getInt(1);
//					System.out.println("Done! Id = " + id);
//				}
//			} else {
//				System.out.println("No row affected.");
//			}
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
////		} catch (ParseException e) {
////			e.printStackTrace();
//		} finally {
//			DB.closeStatement(pst);
//			DB.closeConnection();
//		}
		
		// --------------------------Fazendo alterações no banco de dados------------------------------------

		try {
			conn = DB.getConnection();
			
			pst = conn.prepareStatement("UPDATE seller "
					+ "set BaseSalary = BaseSalary + ? "
					+ "where "
					+ "(DepartmentId = ?)");
			
			pst.setDouble(1, 200);
			pst.setInt(2, 2);
			
			int rowsAffected = pst.executeUpdate();
			
			System.out.println("Done! Rows affected: " + rowsAffected);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DB.closeStatement(pst);
			DB.closeConnection();
		}
		
	}

}
	
