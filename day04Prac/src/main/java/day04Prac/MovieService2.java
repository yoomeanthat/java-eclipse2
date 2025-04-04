package day04Prac;

import java.util.ArrayList;

import acorn.Acorn;

public class MovieService2 {
	
	
	MovieDAO dao = new MovieDAO();
	
	
	
	
	public ArrayList<Movie> getMovieList(){
		
		//데이터베이스 연동
		ArrayList<Movie> list = dao.selectAll();
		
		return list;
		
		
	}
	
	
	
}
