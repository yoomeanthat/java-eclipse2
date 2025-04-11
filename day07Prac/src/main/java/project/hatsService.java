package project;

import java.util.ArrayList;
import java.util.Random;

public class hatsService {
	
	//상품전체가져오기
	public ArrayList<String>  getList(){		
		ArrayList<String>  list = new ArrayList<>();		
		list.add("밀짚모자");
		list.add("스냅백");
		list.add("썬캡");
		list.add("베레모");
		return list;		
	}
	
	
	
	//상품코드로 상품정보 가져오기	
	public String getGoods(String  code) {
		Random r = new Random();		
		String[] list = {"밀짚모자"  , "스냅백" , "썬캡"};
		int index  = r.nextInt(1);
		return  list[index];
	}

}
