package DAO;

import VO.MenuVO;
import VO.PostLink;
import VO.UserVO;
import VO.VOIntf;

public class DAOFactory {
	public static DAOIntf getDAO(VOIntf vo)
	{
		if(vo instanceof UserVO)
			return new UserDAO();
		else if(vo instanceof MenuVO)
			return new MenuDAO();
		else if(vo instanceof PostLink)
			return new PostDAO();
		else
			return new CommentDAO();
	}
}
