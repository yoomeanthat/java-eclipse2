package project;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cinemaSelect")
public class CinemaOneServlet extends HttpServlet {


	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//정보 가져오기 
		String code =req.getParameter("code");
		
		//모델
		CinemaService s = new CinemaService();
		Cinema cinema = s.getCinemaInfo(code);
		
		req.setAttribute("cinema", cinema);
		
		//응답
		req.getRequestDispatcher("WEB-INF/views/cinemaInfo.jsp").forward(req, resp);
		
		
	}
	
}
