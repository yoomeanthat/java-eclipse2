package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CustDAO {
	
	//불러온 sql의 정보와 사용자, 비밀번호 정보
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:testdb";
	String user = "scott";
	String password = "tiger";
	
	
	
	public Connection dbCon() {
		
		Connection con = null;
		
		try {
			//String driver의 내용이 불러오는 위치
			Class.forName(driver);
			//String url, String user, String password 연결하기
			con = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
	}
	
	public ArrayList<Cust> selectAll(){
		
		Connection con = dbCon();
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		ArrayList<Cust> list = new ArrayList<>();
		String sql = "select * from CUSTOMER_TBL";
		
		try {
			pst = con.prepareStatement(sql);
			rs = pst.executeQuery();
			
			while(rs.next()) {
				String id = rs.getString(1);
				String name = rs.getString(2);
				String gender = rs.getString(3);
				String tel = rs.getString(4);
				String grade = rs.getString(5);
				String reserv = rs.getString(6);
				
				Cust c = new Cust(id, name, gender, tel, grade, reserv);
				list.add(c);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
	
	public void update(String id, String newtel) {
		Connection con =dbCon();
		PreparedStatement pst = null;
		
		String sql = "update CUSTOMER_TBL set CUS_TEL=? where CUS_ID=?";
		
		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, newtel);
			pst.setString(2, id);
			
			pst.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	public Cust selectOne(String id) {
		
		Connection con = dbCon();
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		String sql = "select * from CUSTOMER_TBL where CUS_ID =?";
		Cust cust = null;
		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, id);
			rs = pst.executeQuery();
			
			if(rs.next()) {
				String id_temp = rs.getString(1);
				String name = rs.getString(2);
				String gender = rs.getString(3);
				String tel = rs.getString(4);
				String grade = rs.getString(5);
				String reserv = rs.getString(6);
				cust = new Cust(id_temp, name, gender, tel, grade, reserv);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return cust;
	}
	
	
	public void delete(String id) {
		Connection con = dbCon();
		String sql = "delete from CUSTOMER_TBL where CUS_ID= ?";
		PreparedStatement pst = null;
		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, id);
			
			pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void insertCust(Cust newCust) {
		Connection con =dbCon();
		PreparedStatement pst = null;
		
		String sql="insert into CUSTOMER_TBL(CUS_ID, CUS_NAME, CUS_GENDER, CUS_TEL, CUS_GRADE, R_NUM) values(?,?,?,?,?,?)";
		
		try {
			pst = con.prepareStatement(sql);
			
			pst.setString(1, newCust.getId());
			pst.setString(2, newCust.getName());
			pst.setString(3, newCust.getGender());
			pst.setString(4, newCust.getTel());
			pst.setString(5, newCust.getGrade());
			pst.setString(6, newCust.getReserv());
			
			pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	public static void main(String[] args) {
		
		CustDAO c = new CustDAO();
		/*ArrayList <Cust> list = c.selectAll();
		
		System.out.println(list);
		
		
		
		Cust custone = c.selectOne("C1");
		System.out.println(custone);
		
		*/
		
//		Cust s = new Cust("C10", "김유민", "M", "010-3609-4215" , "VVIP", "R10");
//		System.out.println(s);
		
		
		
	}
	
	
	
	
	
	
}
