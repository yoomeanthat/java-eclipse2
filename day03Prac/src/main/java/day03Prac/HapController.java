package day03Prac;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hapMvc")
public class HapController extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		//1~10까지 합 => 자바
		//HapService - getTentotal()
		
		
		
		//서블릿과 jsp가 함께 공유하는 저장소
		//request객체를 저장소로 사용함
		
		//저장소 (request저장소: 요청~응답될 때까지 유지되는 저장소)
		
//		int sum = 55;
		
		//저장소에 저장하기
		
		HapService service = new HapService();	//Model
		int sum = service.getTentotal();
		
		//저장소에 저장하기(jsp view에서 데이터를 사용하기 위해 저장한다)
		request.setAttribute("hap", sum);
		
		
		//응답 jsp로 포워드 시킴(jsp로 가서 응답됨)
		request.getRequestDispatcher("WEB-INF/views/hapView.jsp").forward(request, response);
	}
}
