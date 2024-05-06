package com.vti.lesson14;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.vti.lesson01.Account;

public class AccountDB {

	public static List<Account> getAll() {

		Connection conn = MyDBConnection.getConnection();
		List<Account> result = new ArrayList<>();
		try {
			Statement stm = conn.createStatement();
			String sql = "SELECT AccountId, Email, UserName, FullName FROM account";
			ResultSet rs = stm.executeQuery(sql);
			while (rs.next()) {
				int id = rs.getInt(1);
				String email = rs.getString(2);
				String userName = rs.getString(3);
				String fullName = rs.getString(4);
				Account c = new Account();
				c.accountId = id;
				c.email = email;
				c.fullName = fullName;
				c.userName = userName;
				result.add(c);
			}
			rs.close();
			stm.close();
			conn.close();

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

		return result;
	}

	

	public static void main(String[] args) {
		System.out.println(AccountDB.getAll());
		
	}

}