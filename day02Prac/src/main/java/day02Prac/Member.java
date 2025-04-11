package day02Prac;

public class Member {
	
	String id;
	String pw;
	String name;
	String tel;
	String birthday;
	int point;
	int grade;
	
	
	public Member(String id, String pw, String name, String tel, String birthday, int point, int grade) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.tel = tel;
		this.birthday = birthday;
		this.point = point;
		this.grade = grade;
	}


	public Member() {
		
	}


	@Override
	public String toString() {
		return "Member [id=" + id + ", pw=" + pw + ", name=" + name + ", tel=" + tel + ", birthday=" + birthday
				+ ", point=" + point + ", grade=" + grade + "]";
	}


	public String getId() {
		return id;
	}


	public String getPw() {
		return pw;
	}


	public String getName() {
		return name;
	}


	public String getTel() {
		return tel;
	}


	public String getBirthday() {
		return birthday;
	}


	public int getPoint() {
		return point;
	}


	public int getGrade() {
		return grade;
	}
	
	
	
	
	
	
	
}
