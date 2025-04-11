package day03실습;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/fakeMovieMVC")
public class fakeMovieController extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		fakeMovieService f = new fakeMovieService();
		ArrayList<Movie> list = f.getMovieInfo();
		
//		System.out.println(list);
		
		req.setAttribute("fakeMovie", list);
		req.getRequestDispatcher("WEB-INF/views/fakeMovieView.jsp").forward(req, resp);
	}
}
