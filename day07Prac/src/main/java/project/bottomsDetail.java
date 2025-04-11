package project;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/bottomsDetail")
public class bottomsDetail   extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		
		String bottomscode= req.getParameter("bottomscode");
		if(bottomscode== null)  bottomscode="t02";
		 
		//Model 구하기
		bottomsService s = new bottomsService();
		String bottoms= s.getGoods(bottomscode);
		//Model 심기
		
		
		System.out.println( bottoms);
		
		//모델심기
		req.setAttribute("bottoms", bottoms);
		
		req.getRequestDispatcher("WEB-INF/project/bottomsDetail.jsp").forward(req, resp);
	}

}
