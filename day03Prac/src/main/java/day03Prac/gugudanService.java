package day03Prac;

import java.util.ArrayList;

public class gugudanService {
	
	public ArrayList<String> getGugudan(int num){
		
		ArrayList<String> list = new ArrayList<>();
		
		for(int i=1; i<=9; i++) {
			list.add("3"+"*"+i+"="+num*i);
		}
		
		return list;
	}
	
	

	public static void main(String[] args) {
		gugudanService g = new gugudanService();
		ArrayList<String> list = g.getGugudan(5);
		
		for(String num : list) {
			System.out.println(num);
		}

	}

}
