package project;

import java.util.ArrayList;
import java.util.Random;

public class shoesService {
	
	//상품전체가져오기
	public ArrayList<String>  getList(){		
		ArrayList<String>  list = new ArrayList<>();		
		list.add("운동화");
		list.add("구두");
		list.add("부츠");
		list.add("샌들");
		list.add("슬리퍼");
		return list;		
	}
	
	
	
	//상품코드로 상품정보 가져오기	
	public String getGoods(String  code) {
		Random r = new Random();		
		String[] list = {"운동화"  , "구두" , "부츠"};
		int index  = r.nextInt(2);
		return  list[index];
	}

}
