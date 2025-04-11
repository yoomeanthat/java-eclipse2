package day03Prac;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/gugudanMVC")
public class gugudanController extends HttpServlet{
		
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		String num_=req.getParameter("num");
		int num = Integer.parseInt(num_);
		
		
		gugudanService service = new gugudanService();
		ArrayList<String> list = service.getGugudan(num);
		
		System.out.println(list);
		
		req.setAttribute("gugudan", list);
		req.getRequestDispatcher("WEB-INF/views/gugudanView.jsp").forward(req, resp);
		
	}
}
