package project;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/CustController")
public class CustController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		CustService c = new CustService();
		ArrayList<Cust> list = c.getCustList();
		
		//request 저장소 데이터 저장
		req.setAttribute("list", list);
		
		//jsp 로 포워드
		req.getRequestDispatcher("WEB-INF/views/custList.jsp").forward(req, resp);
		
	}
}
