package project;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/hats")
public class hatsListServlet  extends HttpServlet{
	
	 @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {		 
		 
		 hatsService s = new hatsService();
		 ArrayList<String> list  = s.getList();
		 
		 HttpSession session = req.getSession();
		 String id = (String)session.getAttribute("id");
		 
		 if( id == null) {
				
				resp.sendRedirect("/day07Prac/login");
	            return;
	        }
		 
		 
		 //모델에 저장하기
		 req.setAttribute("hats", list);
		 
		 
		 //상품 뷰로 포워드
		 //상품리스트 뷰가 응답됨
		 req.getRequestDispatcher("WEB-INF/project/hatsList.jsp").forward(req, resp);
	}

}
