package project;

import java.util.ArrayList;
import java.util.Random;

public class topsService {
	
	//상품전체가져오기
	public ArrayList<String>  getList(){		
		ArrayList<String>  list = new ArrayList<>();		
		list.add("티셔츠");
		list.add("니트");
		list.add("맨투맨");
		list.add("히트텍");
		list.add("나시");
		return list;		
	}
	
	
	
	//상품코드로 상품정보 가져오기	
	public String getGoods(String  code) {
		Random r = new Random();		
		String[] list = {"티셔츠"  , "니트" , "맨투맨"};
		int index  = r.nextInt(2);
		return  list[index];
	}

}
