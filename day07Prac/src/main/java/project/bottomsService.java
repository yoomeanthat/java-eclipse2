package project;

import java.util.ArrayList;
import java.util.Random;

public class bottomsService {
	
	//상품전체가져오기
	public ArrayList<String>  getList(){		
		ArrayList<String>  list = new ArrayList<>();		
		list.add("슬랙스");
		list.add("청바지");
		list.add("치마");
		list.add("반바지");
		return list;		
	}
	
	
	
	//상품코드로 상품정보 가져오기	
	public String getGoods(String  code) {
		Random r = new Random();		
		String[] list = {"슬랙스"  , "청바지" , "치마"};
		int index  = r.nextInt(1);
		return  list[index];
	}

}
