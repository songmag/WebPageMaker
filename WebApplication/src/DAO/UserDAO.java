package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

import javax.naming.NamingException;

import VO.MenuVO;
import VO.PostLink;
import VO.UserVO;
import VO.VOIntf;

public class UserDAO extends DBPool implements DAOIntf{
	final private String INSERTUSER = "insert into login"
 			+ "(id,password,user_name,user_when,permission,address,phone,homepage_address,self_introduction,major)"
 			+ " values (?,?,?,?,?,?,?,?,?,?)";//10개
	private final String DELETE ="delete from login where id = ?";
	private final String UPDATE ="update login set ? = ? where id = ?"; 
	private final String SELECT ="select * from login where id = ? and password=?";
	
	private Connection con= null;
	public UserDAO()
	{
		
	}
	public UserVO selectUser(UserVO user)
	{
		PreparedStatement sql=null;
		ResultSet rs = null;
		try {
			con = getConnection();
		} catch (NamingException | SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			sql = con.prepareStatement(SELECT);
			System.out.println(user.getId());
			System.out.println(user.getPw());
			sql.setString(1, user.getId());
			sql.setString(2, user.getPw());
			rs = sql.executeQuery();
			if(rs.next())
			{
				user.setIdNum(rs.getInt("id_num"));
				user.setIntroduction(rs.getString("self_introduction"));
				user.setAddress(rs.getString("address"));
				user.setMajor(rs.getString("major"));
				user.setPermission(rs.getInt("permission"));
				user.setName(rs.getString("user_name"));
				user.setPhone(rs.getString("phone"));
			}
			else
			{
				user = null;
			}
			DAOIntf dao = DAOFactory.getDAO(user.getMenu());
			user.setMenu((MenuVO)dao.select(user));
			user.getMenu().setUserId(user.getId());
			dao = DAOFactory.getDAO(new PostLink());
			user.getMenu().set(dao.select(user.getMenu()));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(sql != null) {
				try {
					sql.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(con != null)
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
		return user;
	}
	public void insertUser(UserVO user)
	{
		MenuVO menu_tmp = new MenuVO();
		PreparedStatement sql = null;
		try {
			con = getConnection();
			con.setAutoCommit(false);
			sql = con.prepareStatement(INSERTUSER);
			sql.setString(1, user.getId());
			sql.setString(2, user.getPw());
			sql.setString(3, user.getName());
			sql.setTimestamp(4, new Timestamp(0));
			sql.setInt(5, user.getPermission());
			sql.setString(6,user.getAddress());
			sql.setString(7, user.getPhone());
			sql.setString(8,null);
			sql.setString(9, user.getIntroduction());
			sql.setString(10, user.getMajor());
			sql.executeQuery();
			con.commit();//commit 하고 작동 한 다음 이후 다시 user를 받아와야한다.
			menu_tmp.set(user.getMenu());
			select(user);
			user.setMenu(menu_tmp);
		} catch (SQLException | NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			if(sql != null) {
				try {
					sql.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(con != null)
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		DAOIntf dao = DAOFactory.getDAO(new MenuVO());
		dao.insert(user);
	}
	public void deleteUser(UserVO user)
	{
		PreparedStatement sql=null;
		try {
			con= getConnection();
			con.setAutoCommit(false);
			sql = con.prepareStatement(DELETE);
			sql.setString(1, user.getId());
			sql.executeQuery();
			con.commit();
		} catch (SQLException | NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			if(sql != null) {
				try {
					sql.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(con!= null)
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}	
	}
	public void updateUser(UserVO user,String column,String value)
	{
		PreparedStatement sql=null;
		try {
			con = getConnection();
			con.setAutoCommit(false);
			sql = con.prepareStatement(UPDATE);
			sql.setString(1, column);
			sql.setString(2, value);
			sql.setString(3, user.getId());
			sql.executeQuery();
			con.commit();
		} catch (SQLException | NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			if(sql != null) {
				try {
					sql.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(con != null)
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
	@Override
	public VOIntf select(VOIntf vo) {
		return selectUser((UserVO)vo);
	}
	@Override
	public void insert(VOIntf vo) {
		// TODO Auto-generated method stub
		insertUser((UserVO)vo);
	}
	@Override
	public void delete(VOIntf vo) {
		// TODO Auto-generated method stub
		deleteUser((UserVO)vo);
	}
	@Override
	public void update(VOIntf vo,String column,String value) {
		// TODO Auto-generated method stub
		updateUser((UserVO)vo,column,value);
	}
}
