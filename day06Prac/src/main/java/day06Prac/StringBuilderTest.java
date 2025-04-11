package day06Prac;

public class StringBuilderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String => 불변객체
		
		String str = "hello";
		str += "servlet";
		
		
		System.out.println(str);
		
		
		//문자열을 많이 추가할 때는 => String 대신에 StringBuilder 사용함(성능 좋음)
		
		
		
		//문자열 수정이 가능하다 , 내부적으로 문자열 배열을 가진다( 특정크기로 만들어짐)
		//012345678910111213
		//helloservlet
		StringBuilder strb = new StringBuilder(100);
		strb.append("hello");
		strb.append("servlet");
		strb.append("!!");
		strb.append("^^");
		
		System.out.println(strb.toString());
		
		
	}
	
}
