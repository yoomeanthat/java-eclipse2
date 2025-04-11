package day03실습;

import java.util.ArrayList;

public class fakeMovieService {

	public ArrayList<Movie> getMovieInfo() {
		ArrayList<Movie> list = new ArrayList<>();

		list.add(new Movie("명량", "김유민", "120분", "2015-02-18", "1700만명", 9.83));
		list.add(new Movie("극한직업", "이유민", "121분", "2014-01-23", "1600만명", 8.35));
		list.add(new Movie("신과함께", "박유민", "91분", "2020-05-03", "1500만명", 7.84));
		list.add(new Movie("국제시장", "하유민", "154분", "2023-06-14", "1400만명", 7.94));
		list.add(new Movie("어벤져스", "안유민", "136분", "2022-07-24", "1300만명", 9.91));

		return list;
	}
}
