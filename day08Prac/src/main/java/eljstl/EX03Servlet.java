package eljstl;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ex03")
public class EX03Servlet extends HttpServlet{
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//모델
		
		ArrayList<String> list = new ArrayList<>();
		list.add("아메리카노");
		list.add("카페라떼");
		list.add("카푸치노");
		
		
		
		req.setAttribute("list", list);
		
		req.getRequestDispatcher("WEB-INF/views/ex03.jsp").forward(req, resp);
	}
}
