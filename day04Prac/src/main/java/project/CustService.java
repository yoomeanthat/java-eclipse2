package project;

import java.util.ArrayList;

public class CustService {
	
	CustDAO dao = new CustDAO();
	
	
	public ArrayList<Cust> getCustList(){
		
		//DB 연동
		ArrayList<Cust> list = dao.selectAll();
		
		return list;
	}
	
	public Cust getCustInfo(String id) {
		
		Cust cust = dao.selectOne(id);
		return cust;
	}
	
	
	public void modifyCust(String id, String tel) {
		dao.update(id, tel);
	}
	
	
	public void deleteCust(String id) {
		dao.delete(id);
	}
	
	public void registerCust(Cust cust) {
		
		dao.insertCust(cust);
	}
}

