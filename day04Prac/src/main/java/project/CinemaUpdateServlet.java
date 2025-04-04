package project;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/updateCinema")
public class CinemaUpdateServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		//한글 인코딩
		req.setCharacterEncoding("utf-8");
		
		//정보 가져오기
		String code = req.getParameter("code");
		String name = req.getParameter("name");
		String brand = req.getParameter("brand");
		String tel = req.getParameter("tel");
		
		//수정 서비스
		CinemaService s = new CinemaService();
	    s.updateCinema(code, tel);
		
		
	}
	
}
