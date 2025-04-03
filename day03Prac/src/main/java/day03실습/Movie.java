package day03실습;

public class Movie {
	
	String name;
	String dirname;
	String playtime;
	String reldate;
	String accumseen;
	double grade;
	
	
	public Movie(String name, String dirname, String playtime, String reldate, String accumseen, double grade) {
		super();
		this.name = name;
		this.dirname = dirname;
		this.playtime = playtime;
		this.reldate = reldate;
		this.accumseen = accumseen;
		this.grade = grade;
	}


	public Movie() {
		
	}


	public String getName() {
		return name;
	}


	public String getDirname() {
		return dirname;
	}


	public String getPlaytime() {
		return playtime;
	}


	public String getReldate() {
		return reldate;
	}


	public String getAccumseen() {
		return accumseen;
	}


	public double getGrade() {
		return grade;
	}


	@Override
	public String toString() {
		return "Movie [name=" + name + ", dirname=" + dirname + ", playtime=" + playtime + ", reldate=" + reldate
				+ ", accumseen=" + accumseen + ", grade=" + grade + "]" + "<br>";
		
	}
	
	
	
	
	
	
}
