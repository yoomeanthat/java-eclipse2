package project;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/updateCust")
public class CustUpdateServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//한글 인코딩
		req.setCharacterEncoding("utf-8");
		//사용자 정보 가져오기
		String id = req.getParameter("id");
		String name = req.getParameter("name");
		String gender = req.getParameter("gender");
		String tel = req.getParameter("tel");
		String grade = req.getParameter("grade");
		String reserv = req.getParameter("reserv");
		
		System.out.println(id);
		System.out.println(name);
		System.out.println(gender);
		System.out.println(gender);
		System.out.println(grade);
		System.out.println(reserv);
		
		//회원정보 변경 서비스
		
		CustService c = new CustService();
		c.modifyCust(id,tel);
		
		
		req.getRequestDispatcher("WEB-INF/views/updateCust.jsp").forward(req, resp);
	}
}
