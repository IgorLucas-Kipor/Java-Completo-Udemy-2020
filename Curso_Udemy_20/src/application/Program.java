package application;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;
import db.DbException;

public class Program {

	public static void main(String[] args) {

//		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Connection conn = null;
//		DB.closeConnection();
		Statement st = null;
//		ResultSet rs = null;
//		PreparedStatement pst = null;
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

		// ----------------------------------Inserindo dados na
		// tabela------------------------------

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

		// --------------------------Fazendo alterações no banco de
		// dados------------------------------------

//		try {
//			conn = DB.getConnection();
//			
//			pst = conn.prepareStatement("UPDATE seller "
//					+ "set BaseSalary = BaseSalary + ? "
//					+ "where "
//					+ "(DepartmentId = ?)");
//			
//			pst.setDouble(1, 200);
//			pst.setInt(2, 2);
//			
//			int rowsAffected = pst.executeUpdate();
//			
//			System.out.println("Done! Rows affected: " + rowsAffected);
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			DB.closeStatement(pst);
//			DB.closeConnection();
//		}

		// -----------------------------Deletando do banco de
		// dados------------------------------

//		try {
//			conn = DB.getConnection();
//			
//			pst = conn.prepareStatement("DELETE from department "
//					+ "where "
//					+ "ID = ?");
//			
//			pst.setInt(1, 5);
//			
//			int rowsAffected = pst.executeUpdate();
//			
//			System.out.println("Done! Rows affected: " + rowsAffected);
//		} catch (SQLException e) {
//			throw new DbIntegrityException(e.getMessage());
//		} finally {
//			DB.closeStatement(pst);
//			DB.closeConnection();
//		}

		// --------------------------------------Fazendo
		// transações-------------------------------------

		try {
			conn = DB.getConnection();
			conn.setAutoCommit(false);
			st = conn.createStatement();

			int rows1 = st.executeUpdate("UPDATE seller set BaseSalary = 2090 where DepartmentId = 1");
//			int x = 1;
//			if (x < 2) {
//				throw new SQLException("Fake error");
//			}
			int rows2 = st.executeUpdate("UPDATE seller set BaseSalary = 3090 where DepartmentId = 2");
			
			conn.commit();

			System.out.println("Rows 1: " + rows1);
			System.out.println("Rows 2: " + rows2);
		} catch (SQLException e) {
			try {
				conn.rollback();
				throw new DbException("Transaction rolled back. Caused by: " + e.getMessage());
			} catch (SQLException e1) {
				throw new DbException("Error trying to rollback. Cause by: " + e.getMessage());
			}
		} finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}

	}

}
