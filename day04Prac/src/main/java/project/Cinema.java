package project;

public class Cinema{

	String code;
	String name;
	String brand;
	String tel;
	
	public Cinema(String code, String name, String brand, String tel) {
		super();
		this.code = code;
		this.name = name;
		this.brand = brand;
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "Cinema [code=" + code + ", name=" + name + ", brad=" + brand + ", tel=" + tel + "]";
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
	
}
