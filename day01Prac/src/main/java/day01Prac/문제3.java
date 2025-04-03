package day01Prac;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/whatdan")
public class 문제3 extends HttpServlet {
    
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {
        
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=UTF-8");

        
        String danParam = req.getParameter("dan");
        int dan = 2;

        try {
            if (danParam != null) {
                dan = Integer.parseInt(danParam);
            }
        } catch (NumberFormatException e) {
            dan = 2;
        }

        // HTML 응답 출력
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>구구단 출력</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>" + dan + "단</h1>");
        out.println("<ul>");

        // 구구단 출력
        for (int i = 1; i <= 9; i++) {
            out.println("<li>" + dan + " × " + i + " = " + (dan * i) + "</li>");
        }

        out.println("</ul>");
        out.println("</body>");
        out.println("</html>");
        
        out.close(); // 출력 스트림 닫기
    }
}
