package DAO;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class DBPool {
	protected Connection getConnection () throws NamingException, SQLException	
	{
		Context initContext = new InitialContext();
		DataSource source = (DataSource)initContext.lookup("java:comp/env/jdbc/orcl");
		Connection con = source.getConnection();
		return con;
	}
}
