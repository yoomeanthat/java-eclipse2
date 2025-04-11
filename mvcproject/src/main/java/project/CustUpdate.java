package project;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/CustUpdate")
public class CustUpdate extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//
		
		//사용자 정보가져오기( 쿼리스트링 ?id= )
		//
				
		String id = req.getParameter("id");
		System.out.println(id);

		
		//모델
		//id에 대한 회원정보가져오기
		
		
		CustService c = new CustService();
		Cust cust = c.getCustInfo(id);
		
		//
		
		req.setAttribute("cust", cust);
		
		//응답
		req.getRequestDispatcher("WEB-INF/views/custOne.jsp").forward(req, resp);
		
	}
}
