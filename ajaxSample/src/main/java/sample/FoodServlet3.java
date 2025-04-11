package sample;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

@WebServlet("/food3")
public class FoodServlet3  extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		 
		resp.setCharacterEncoding("utf-8");
		resp.setContentType("application/json;charset=utf-8");	
		
		FoodService service = new FoodService();
		JSONObject o= service.getFoodInfo();
		resp.getWriter().println( o);
		
		
		
		
	}

}
