package com.vti.lesson14;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PositionDB {
	public static void printAllPositions() {
		Connection conn = MyDBConnection.getConnection();
		String sql = "SELECT PositionID, PositionName FROM position";

		try {
			Statement stm = conn.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			while (rs.next()) {
				System.out.println("ID = " + rs.getInt(1));
				System.out.println("Name = " + rs.getString(2));
			}
			rs.close();
			stm.close();
			conn.close();
		}

		catch (SQLException e) {
			System.err.println(e);
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					System.err.println(e);
				}
			}
		}
	}

	public static int insertPosition(String name) {
		Connection conn = MyDBConnection.getConnection();
		String sql = "INSERT INTO position (PositionName) VALUES(?)";
		try {
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, name);
			int result = pst.executeUpdate();

			pst.close();
			conn.close();
			return result;
		} catch (SQLException e) {
			System.err.println(e);
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					System.err.println(e);
				}
			}
		}
		return 0;
	}
	
	public static int updatePosition(int id, String newName) {
		String sql = "UPDATE Position SET PositionName = ? WHERE PositionID = ?;";
		Connection conn = MyDBConnection.getConnection();
		try {
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, newName);
			pst.setInt(2, id);
			int result = pst.executeUpdate();
			pst.close();
			conn.close();
			return result;
		} catch (SQLException e) {
			System.err.println(e);
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					System.err.println(e);
				}
			}
		}
		return 0;

	}

	public static void main(String[] args) {
//		PositionDB.printAllPositions();
//		System.out.println(PositionDB.insertPosition("R&D"));
		System.out.println(PositionDB.updatePosition(13, "Marketing Research"));
	}
}
