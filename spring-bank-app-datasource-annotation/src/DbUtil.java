package com.capgemini.bankapp.util;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import javax.sql.DataSource;
import org.apache.log4j.Logger;

public class DbUtil {

	private static String className;
	private static String dburl;
	private static String username;
	private static String password;
	private static DataSource dataSource;
	
	static Connection connection;
	static final Logger logger = Logger.getLogger(DbUtil.class);

	
	public DbUtil(DataSource dataSource){
		this.dataSource=dataSource;
		//connection = DataSource.getConnection;
	}

	/*public static Connection getConnection(Properties properties) {
		
	
		
		//System.out.println(classname);
		try {
			Class.forName(className);
			if (connection == null) {
				connection = DriverManager.getConnection(dburl, username, password);
				connection.setAutoCommit(false);
			}
		} catch (ClassNotFoundException e) {
			System.out.println("Driver class not found....");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}*/

	
	

	public static void commit() {
		try {
			if (connection != null)
				connection.commit();
		} catch (SQLException e) {
			logger.error("SQLException: ", e);
		}
	}

	public static void rollback() {
		try {
			if (connection != null)
				connection.rollback();
		} catch (SQLException e) {
			logger.error("SQLException: ", e);
		}
	}

	

}