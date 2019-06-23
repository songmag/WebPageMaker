package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.DAOFactory;
import DAO.DAOIntf;
import VO.UserVO;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {
		super();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		UserVO user = new UserVO().setId(request.getParameter("id")).setPw(request.getParameter("pw"));
		DAOIntf dao = DAOFactory.getDAO(user);
		user = (UserVO)dao.select(user);
		if(user == null)
		{
			PrintWriter out = response.getWriter();
			out.println("<script>");
			out.println("alert('id checked error');");
			out.println("history.back();");
			out.println("</script>");
			return;
		}
		else {
			request.getSession().setAttribute("user",user);
			RequestDispatcher dispatcher = request.getRequestDispatcher("/BridgeServlet?requestPage=PostListServlet");
			dispatcher.forward(request, response);
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}