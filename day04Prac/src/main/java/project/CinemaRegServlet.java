package project;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/regCinema")
public class CinemaRegServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.getRequestDispatcher("WEB-INF/views/cinemaReg.jsp").forward(req, resp);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//한글 인코딩
		req.setCharacterEncoding("utf-8");
		
		//정보 가져오기
		String code = req.getParameter("code");
		String name = req.getParameter("name");
		String brand = req.getParameter("brand");
		String tel = req.getParameter("tel");
		
		Cinema cinema = new Cinema(code, name, brand, tel);
		
		//디비에 등록
		CinemaService s = new CinemaService();
		s.registerCinema(cinema);
		
		//재요청?
		resp.sendRedirect("/day05Prac/cinemaList");
		
	}
	
}
