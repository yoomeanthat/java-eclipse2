package day01Prac;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/fighting")
public class FirstServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setCharacterEncoding("utf-8"); // 한글인코딩
		response.setContentType("text/html;charset=utf-8"); // 서버가 보내는 데이터의 형식이
															// html문서, 한글로 해석하라는 뜻

		// 응답하기, 화이팅메시지 응답하기
		String str = "fighting ^^";

		// 응답스트링 얻어오기
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>" + str + "</h1>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}
}