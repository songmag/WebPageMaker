package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.DAOFactory;
import DAO.DAOIntf;
import VO.MenuVO;
import VO.PostLink;
import VO.UserVO;
import VO.VOIntf;

@WebServlet("/SignupServlet")
public class SignupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public SignupServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		VOIntf user = makeUser(request);
		DAOIntf dao = DAOFactory.getDAO(user);
		dao.insert(user);
		PrintWriter out=response.getWriter();
		out.println(makeString());
	}
	protected UserVO makeUser(HttpServletRequest request)
	{
		UserVO user;
		user= new UserVO().setId(request.getParameter("id"))
				.setPw(request.getParameter("pw"))
				.setName(request.getParameter("name"))
				.setIntroduction(request.getParameter("identity"))
				.setMajor(request.getParameter("major"));
		MenuVO menu = new MenuVO();
		String[] menu_strs= request.getParameterValues("menulist");
		for(String menu_str : menu_strs)
		{
			menu.put(menu_str,new PostLink());
		}
		user.setMenu(menu);
		return user;
	}
	//이 방법 말고 다른방법은 없나요??
	protected String makeString()
	{
		String outString = "<html>";
		outString += "<head>";
		outString += "</head>";
		outString += "<title>";
		outString += "</title>";
		outString += "<body>";
		outString += "<script>";
		outString += "window.close();";
		outString += "</script>";
		outString += "</body>";
		outString += "</html>";
		return outString;		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
