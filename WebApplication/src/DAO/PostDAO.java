package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Enumeration;

import javax.naming.NamingException;

import VO.MenuVO;
import VO.PostLink;
import VO.PostVO;
import VO.VOIntf;
public class PostDAO extends DBPool implements DAOIntf{
	private final String POSTSELECT = "select * from post where menu_num in (select menu_num from menu where menu_str =?)"; 
	private final String POSTCONTENTSELECT = "select PostContents from postcontents where PostNum = ?";
	private Connection con;
	private PreparedStatement pre;
	private ResultSet rs;
	private MenuVO selectPost(MenuVO vo) throws NamingException, SQLException
	{
		Enumeration<String> keys = vo.keys();
		String key = null;
		con = getConnection();
		pre = con.prepareStatement(POSTSELECT);
		while(keys.hasMoreElements())
		{
			key = keys.nextElement();
			PostLink list = new PostLink();
			pre.setString(1, key);
			rs = pre.executeQuery();
			list.setMenu_str(key);
			list.setUser_id(vo.getUserId());
			while(rs.next())
			{
				list.add(new PostVO().setPostnumber(rs.getInt("post_num"))
					.setPermission(rs.getInt("permission"))
					.setPostName(rs.getString("post_name"))
					.setWhen(rs.getTimestamp("post_when")));
			}
			vo.put(key, list);
		
		}
		if(rs != null)
			rs.close();
		if(pre != null)
			pre.close();
		if(con != null)
			con.close();
		return vo;
	}
	private PostVO selectPostContents(PostVO vo)
	{
		//제목이 같은데 내용이 다른경우는?
		ResultSet rs= null;
		try {
			con = getConnection();
			pre = con.prepareStatement(POSTCONTENTSELECT);
			pre.setInt(1, vo.getPostnumber());
			rs = pre.executeQuery();
			if(rs.next())
			{
				vo.setPostContents(rs.getString(1));
			}
		} catch (NamingException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return vo;
	}
	@Override
	public VOIntf select(VOIntf vo) {
		if(vo instanceof PostLink)
		{
			
		}
		else if(vo instanceof MenuVO) 
		{
			try {
				return selectPost((MenuVO)vo);
			} catch (NamingException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if(vo instanceof PostVO)
		{
			return (VOIntf)selectPostContents((PostVO)vo);
		}
		return null;
	}
	@Override
	public void insert(VOIntf vo) {
		// TODO Auto-generated method stub
	}

	@Override
	public void delete(VOIntf vo) {
		// TODO Auto-generated method stub
	}

	@Override
	public void update(VOIntf vo, String column, String name) {
		// TODO Auto-generated method stub
	}
}