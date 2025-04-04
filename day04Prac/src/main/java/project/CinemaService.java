package project;

import java.util.ArrayList;

public class CinemaService {

	CinemaDAO dao = new CinemaDAO();
	
	//조회
	public ArrayList<Cinema> getCinemaList(){
		
		ArrayList<Cinema> list = dao.selectAll();
		return list;
		
	}
	
	//등록
	public void registerCinema(Cinema cinema) {
		
		dao.insertCinema(cinema);
		
	}
	//지정 조회 
	public Cinema getCinemaInfo(String code) {
		
		Cinema cinema = dao.selectCinema(code);
				
		return cinema;
		
	}
	
	//수정
	public void updateCinema(String code, String tel) {
		
		dao.updateCinema(code, tel);
		
		
	}
	
}
