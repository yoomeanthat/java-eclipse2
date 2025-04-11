package day02Prac;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/squid2")
public class squid2 extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		
		
		//데이터 만들기
		
		 String driver="oracle.jdbc.driver.OracleDriver";
		 String url="jdbc:oracle:thin:@localhost:1521:testdb";
		 String user="scott";
		 String password="tiger";
		 
		 
		 ArrayList<Member> list = new ArrayList<>();
		 
		 
		 
		 
		 try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, user, password);
			
			
			if(con != null) System.out.println("db ok");
			
			String sql = "select * from member_tbl_11";
			
			Statement st = con.createStatement();
			
			ResultSet rs = st.executeQuery(sql);
			
			while(rs.next()) {	// 한 행씩 읽는다
				
				String id = rs.getString(1);
				String pw = rs.getString(2);
				String name = rs.getString(3);
				String tel = rs.getString(4);
				String birthday = rs.getString(5);
				int point = rs.getInt(6);
				int grade = rs.getInt(7);
				
				Member member = new Member(id, pw, name, tel, birthday, point, grade);
				list.add(member);
			}
			
			
			System.out.println(list);
						
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 
		 resp.setCharacterEncoding("utf-8");
		 resp.setContentType("text/html;charset=utf-8");
		 
		 PrintWriter out = resp.getWriter();
		 
		 
		//응답하기
		 
		 out.println("<html>");
		 out.println("<head>");
		 out.println("<style>");
		 out.println("table{border:1px solid black; margin: 0 auto}");
		 out.println("td{border:1px solid black; width: 100px; text-align: center}");
		 out.println("span{color:red}");
		 out.println("</style>");
		 out.println("</head>");
		 out.println("<body>");
		 out.println("<table>");
		 
		 out.println("<tr>");
		 out.println("<td><span>아이디</span></td>");
		 out.println("<td>비번</td>");
		 out.println("<td>이름</td>");
		 out.println("<td>전화번호</td>");	 
		 out.println("<td>생일</td>");
		 out.println("<td>포인트</td>");
		 out.println("<td>등급</td>");
		 out.println("</tr>");
		 
		 for(Member a : list) {
			 
			 out.println("<tr>");
			 out.println("<td>" + a.getId()+ "</td>");
			 out.println("<td>" + a.getPw()+ "</td>");
			 out.println("<td>" + a.getName()+ "</td>");
			 out.println("<td>" + a.getTel()+ "</td>");
			 out.println("<td>" + a.getBirthday()+ "</td>");
			 out.println("<td>" + a.getPoint()+ "</td>");
			 out.println("<td>" + a.getGrade()+ "</td>");
			 out.println("</tr>");
			 
		 }
		 
		 out.println("</table>");
		 out.println("</body>");
		 out.println("</html>");
	}
}
