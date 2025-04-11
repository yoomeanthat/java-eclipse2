package day03Prac;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/gugudan")
public class gugudanServlet extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String num_=req.getParameter("num");
		int num = Integer.parseInt(num_);
		
		ArrayList<String> list = new ArrayList<>();
		for(int i=1; i<=9; i++) {
			list.add(num*i , "3*"+i+ "=");
		}
		
		
		System.out.println(list);
		
		
		PrintWriter out = resp.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		
		out.println(list.toString());
		
		out.println("</body>");
		out.println("</html>");
	}
}
