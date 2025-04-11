package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CinemaDAO {

	//연결 정보 
	String driver = "oracle.jdbc.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:testdb";
	String user = "scott";
	String password = "tiger";
	
	//디비 연결 매서드
	public Connection dbcon() {
		
		Connection con = null;
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			if(con != null) System.out.println("db ok");
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
		
	}
	
	//조회
	public ArrayList<Cinema> selectAll(){
		
		ArrayList<Cinema> list = new ArrayList<>();
	
		//db연결
		Connection con = dbcon();
	    
		String sql = "SELECT * FROM CINEMA_TBL";
		
	    try {
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				
				String code = rs.getString(1);
				String name = rs.getString(2);
				String brand = rs.getString(3);
				String tel = rs.getString(4);
				
				Cinema m = new Cinema(code, name, brand, tel);
				list.add(m);
				
			}
			
			rs.close();
			pst.close();
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	
	}
	
	//등록
	public void insertCinema(Cinema cinema) {
		
		Connection con = dbcon();
		String sql = "insert into CINEMA_TBL(c_code, c_name, c_brand, c_tel) values(?, ?, ?, ?)";
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			
			pst.setString(1, cinema.getCode());
			pst.setString(2, cinema.getName());
			pst.setString(3, cinema.getBrand());
			pst.setString(4, cinema.getTel());
			
			pst.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	//지정 조회
	public Cinema selectCinema(String code) {
		
		Connection con = dbcon();
		
		Cinema cinema = null;
		
		String sql = "select * from CINEMA_TBL where C_CODE = ?";
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);			
			pst.setString(1, code);
		

			
			ResultSet rs = pst.executeQuery();
			
			
			
			if(rs.next()) {
				
				String c_code = rs.getString(1);
			 	String name = rs.getString(2);
				String brand = rs.getString(3);
				String tel = rs.getString(4);
				
				cinema = new Cinema(c_code, name, brand, tel);  
			}
			
			rs.close();
			pst.close();
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return cinema;
		
	}
	
	//수정
	public void updateCinema(String code, String tel) {
		
		Connection con = dbcon();
		
		
		
		String sql = "update CINEMA_TBL set tel =? where code =?";
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			
			pst.setString(1, tel);
			pst.setString(2, code);
			
			pst.executeUpdate();
			
			pst.close();
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	//
	
	public static void main(String[] args) {
		
		CinemaDAO dao = new CinemaDAO();
		Cinema  c  = dao.selectCinema("CC1");
		
		
		System.out.println(c);
		
	}
	
}
