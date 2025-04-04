package project;

public class Cust {
	
	String id;
	String name;
	String gender;
	String tel;
	String grade;
	String reserv;
	
	
	public Cust() {
		super();
	}


	public Cust(String id, String name, String gender, String tel, String grade, String reserv) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.tel = tel;
		this.grade = grade;
		this.reserv = reserv;
	}


	
	@Override
	public String toString() {
		return "Cust [id=" + id + ", name=" + name + ", gender=" + gender + ", tel=" + tel + ", grade=" + grade
				+ ", reserv=" + reserv + "]";
	}


	public String getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public String getGender() {
		return gender;
	}


	public String getTel() {
		return tel;
	}


	public String getGrade() {
		return grade;
	}


	public String getReserv() {
		return reserv;
	}
	
	
	
	
	
	
	
}
