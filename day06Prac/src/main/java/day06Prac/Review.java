package day06Prac;

public class Review {
	
	String id;
	String content;
	
	public Review() {
		
	}
	
	public Review(String id, String content) {
		super();
		this.id = id;
		this.content = content;
	}

	
	@Override
	public String toString() {
		return "Review [id=" + id + ", content=" + content + "]";
	}

	public String getId() {
		return id;
	}

	public String getContent() {
		return content;
	}
	
	
	
	
}
