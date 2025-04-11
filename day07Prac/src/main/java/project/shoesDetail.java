package project;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/shoesDetail")
public class shoesDetail   extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		
		String shoescode= req.getParameter("shoescode");
		if(shoescode== null)  shoescode="t01";
		 
		//Model 구하기
		shoesService s = new shoesService();
		String shoes= s.getGoods(shoescode);
		//Model 심기
		
		
		System.out.println( shoes);
		
		//모델심기
		req.setAttribute("shoes", shoes);
		
		req.getRequestDispatcher("WEB-INF/project/shoesDetail.jsp").forward(req, resp);
	}

}
