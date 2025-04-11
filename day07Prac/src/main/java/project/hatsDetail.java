package project;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/hatsDetail")
public class hatsDetail   extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		
		String hatscode= req.getParameter("hatscode");
		if(hatscode== null)  hatscode="t02";
		 
		//Model 구하기
		hatsService s = new hatsService();
		String hats= s.getGoods(hatscode);
		//Model 심기
		
		
		System.out.println( hats);
		
		//모델심기
		req.setAttribute("hats", hats);
		
		req.getRequestDispatcher("WEB-INF/project/hatsDetail.jsp").forward(req, resp);
	}

}
