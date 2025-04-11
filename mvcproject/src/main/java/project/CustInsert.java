package project;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CustInsert")
public class CustInsert extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.getRequestDispatcher("WEB-INF/views/custJoin.jsp").forward(req, resp);
		
	
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.setCharacterEncoding("utf-8");
		
		String id = req.getParameter("id");
		String name = req.getParameter("name");
		String gender = req.getParameter("gender");
		String tel = req.getParameter("tel");
		String grade = req.getParameter("grade");
		String reserv = req.getParameter("reserv");
		
		System.out.println(id);
		System.out.println(name);
		System.out.println(gender);
		System.out.println(tel);
		System.out.println(grade);
		System.out.println(reserv);
		
		Cust cust = new Cust(id,name,gender,tel,grade, reserv);
		System.out.println(cust);
		
		CustService c = new CustService();
		c.registerCust(cust);
		
		resp.sendRedirect("/mvcproject/CustController");
		
		
		
		
		
	}
}
