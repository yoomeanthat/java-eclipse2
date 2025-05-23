package acorn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AcornDAO2 {
	
	
	//연결정보
	
	String driver="oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:testdb";
	String user="scott";
	String password="tiger";
	
	//데이터베이스 연결 매서드
	
	
	
	
	
	Connection getConnection(){
		
		Connection con = null;
		//
		try {
			Class.forName(driver);
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
	
	
	//조회하기
	
	public ArrayList<Acorn> selectAll(){
		
		ArrayList<Acorn> list = new ArrayList<>();
		//데이터베이스 연결
		Connection con = getConnection();
		String sql = "select * from acorntbl";
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			
			
			
			while(rs.next()) {	//쿼리 결과를 한 행씩 가져오기
				
				String id = rs.getString(1);
				String pw = rs.getString(2);
				String name = rs.getString(3);
				
				
				Acorn acorn = new Acorn (id, pw, name);
				list.add(acorn);
			}
			
			//
			rs.close();
			pst.close();
			con.close();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
		
	}
	
	//한 개 조회
	
	public Acorn selectOne(String id) {
		//디비연결
		Connection con = getConnection();
		
		Acorn acorn = null;
		
		//sql작성
		String sql = "select * from acorntbl where id = ?";
		
		try {
			
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, id);
			
			ResultSet rs = pst.executeQuery();
			
			if(rs.next()) {
				
				String tid = rs.getString(1);
				String pw = rs.getString(2);
				String name = rs.getString(3);
				
				acorn = new Acorn(tid, pw, name);
				
			}
			
			//마무리
			rs.close();
			pst.close();
			con.close();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//실행결과 Acorn 객체변환	
		return acorn;
	}
	
	
	
	//등록하기
	
	
	public void insert(Acorn acorn) {
		Connection con = getConnection();
		String sql = "insert into acorntbl(id, pw, name) values(?,?,?)";
		
		try {
			
			PreparedStatement pst = con.prepareStatement(sql);
			
			//왼쪽물음표부터 1 2 3
			pst.setString(1, acorn.getId());
			pst.setString(2, acorn.getPw());
			pst.setString(3, acorn.getName());
			
			//insert쿼리 실행해 주세요
			pst.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	//변경하기
	
	public void update(String id, String newpw) {
		
		
		Connection con = getConnection();
		
		
		String sql="update acorntbl set pw =? where id = ?";
		
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, newpw);
			pst.setString(2, id);
			
			pst.executeUpdate();	//등록, 변경, 삭제
			
			pst.close();
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//삭제하기
	public void delete(String id) {
		
		Connection con = getConnection();
		String sql = "delete from acorntbl where id =?";
		
		try {
			
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, id);
			pst.executeUpdate();
					
			pst.close();
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		
		AcornDAO2 a = new AcornDAO2();
		a.delete("hong3");
		
//		AcornDAO2 a = new AcornDAO2();
//		a.update("hong3", "9999");
		
		/*
		AcornDAO2 s = new AcornDAO2();
		ArrayList<Acorn> list = s.selectAll();
		
		
		for(Acorn acorn : list) {
			System.out.println(acorn);
		}
		
		*/
		
		
//		AcornDAO2 s = new AcornDAO2();
//		Acorn a = s.selectOne("yunseok");
//		System.out.println(a);
		
		
		
//		AcornDAO2 s = new AcornDAO2();
//		Acorn acorn = new Acorn("hong3", "1234", "최길동");
//		s.insert(acorn);
		
		
		
	}
	
}
