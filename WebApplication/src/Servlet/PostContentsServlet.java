package Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.DAOFactory;
import DAO.DAOIntf;
import VO.PostLink;
import VO.PostVO;
import VO.UserVO;
import VO.VOIntf;
@WebServlet("/PostContentsServlet")
public class PostContentsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public PostContentsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserVO user= (UserVO) request.getSession().getAttribute("user");
		PostLink pl = user.getMenu().get(request.getParameter("CurrentMenu"));
		int post_num = Integer.parseInt(request.getParameter("request_post"));
		PostVO post = null;
		for(int i=0;i<pl.size();i++)
		{ 
			post = pl.get(i);
			if(post.getPostnumber() == post_num)
				break;
		}
		DAOIntf dao = DAOFactory.getDAO(new PostLink());
		dao.select((VOIntf)post);
		request.setAttribute("response_post", post);
		request.setAttribute("jsp","PostContents.jsp");
		return ;
	}
}
