package project;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cinemaList")
public class CinemaListServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//데이터 만들기 (모델)
		CinemaService c = new CinemaService();
		ArrayList<Cinema> list = c.getCinemaList();
		
		//데이터 저장하기
		req.setAttribute("list", list);
		
		//응답하기
		req.getRequestDispatcher("WEB-INF/views/cinemaList.jsp").forward(req, resp);
		
	}
	
}
