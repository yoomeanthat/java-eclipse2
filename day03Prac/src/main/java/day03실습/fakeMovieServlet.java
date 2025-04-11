package day03실습;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/fakeMovie")
public class fakeMovieServlet extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		fakeMovieService s  = new fakeMovieService();
		ArrayList<Movie>  list  = s.getMovieInfo();
 		
		req.setAttribute("fakeMovie", list);
		req.getRequestDispatcher("WEB-INF/views/fakeMovieView.jsp").forward(req, resp);
	}
}
