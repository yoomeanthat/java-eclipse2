package day01Prac;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sum")
public class 문제1 extends HttpServlet {
    
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // 요청 및 응답 한글 깨짐 방지
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");
        
        int su1 = 3;
        int su2 = 5;

        int sum = su1 + su2;
        
        // 콘솔 출력 (서버 측 로그 확인용)
        System.out.println("합계: " + sum);

        // 응답 스트림
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head><title>합 계산</title></head>");
        out.println("<body>");
        out.println("<h1>합계: " + sum + "</h1>");
        out.println("</body>");
        out.println("</html>");
    }
}
