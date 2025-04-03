package day01Prac;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/suAdd")
public class SecondServlet extends HttpServlet {
    
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	
        // 한글 깨짐 방지
        response.setContentType("text/html; charset=UTF-8");
        
        // 요청 파라미터 받기
        String su_ = request.getParameter("su");
        
        int su = 5; // 기본값
        
        // 1부터 su까지 합 구하기
        int sum = 0;
        for (int i = 1; i <= su; i++) {
            sum += i;
        }
        
        System.out.println("합계: " + sum);
        
        // 응답 스트림
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head><title>합 계산</title></head>");
        out.println("<body>");
        out.println("<h1>합계: " + sum + "</h1>");
        out.println("<img src=\"b.jpg\">"); // 올바른 이미지 경로 사용
        out.println("</body>");
        out.println("</html>");
    }
}
