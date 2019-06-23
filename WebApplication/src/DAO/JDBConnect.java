package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class JDBConnect{
	
	public static JDBConnect connect = null;
	private Connection con = null;
	final private String dbid = "root";
	final private String dbpw = "1234";
	final private String db = "myfirstserver";
	final private String localhost = "jdbc:mysql://localhost:3306/";
	//final private String encoding = "?useUnicode=true&characterEncoding=UTF-8";
	public JDBConnect(){
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		connection();
	}
	public void connection() {
		// TODO Auto-generated method stub
		try {
			con = DriverManager.getConnection(localhost+db,dbid, dbpw);
			con.setAutoCommit(false);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	}
	protected void close()
	{
		if(con == null)
			return ;
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static Connection getConnection()
	{
		if(connect == null)
		{
			connect = new JDBConnect();
		}
		return connect.con;
	}
}
