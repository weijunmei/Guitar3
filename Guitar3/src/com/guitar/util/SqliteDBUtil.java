/**
 * 
 */
package com.guitar.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Sqlite��������
 *
 */
public class SqliteDBUtil
{
	public static final String url = "jdbc:sqlite://d:/Guitar2.db";
	public static final String name = "org.sqlite.JDBC";
	public static void main(String[] args)
	{
		Connection conn = SqliteDBUtil.getConnection();
	}

	public static Connection getConnection()
	{
		try
		{
			Class.forName(name);
			return DriverManager.getConnection(url);
		} catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public void closeConnection(Connection conn)
	{
		if (conn != null)
		{
			try
			{
				conn.close();
			} catch (SQLException e)
			{
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}

	}
}
