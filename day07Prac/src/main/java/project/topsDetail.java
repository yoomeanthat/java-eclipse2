package project;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/topsDetail")
public class topsDetail   extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		
		String topscode= req.getParameter("topscode");
		if(topscode== null)  topscode="t01";
		 
		//Model 구하기
		topsService s = new topsService();
		String tops= s.getGoods(topscode);
		//Model 심기
		
		
		System.out.println( tops);
		
		//모델심기
		req.setAttribute("tops", tops);
		
		req.getRequestDispatcher("WEB-INF/project/topsDetail.jsp").forward(req, resp);
	}

}
