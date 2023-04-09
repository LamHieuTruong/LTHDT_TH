package tuan7;

import java.util.ArrayList;
import java.util.List;

public class ListGD {
	List<GiaoDich> ls;
	public ListGD() {
		ls = new ArrayList<GiaoDich>(2);
	}
	public boolean themGD(GiaoDich gd) {
		if(ls.contains(gd) == true) {
			return ls.add(gd);			
		}else
			return false;
	}
	
//	ls.themGD(new GiaoDichDat("GD001", "01/01/2022", 1000000, "A", 200));
//	ls.themGD(new GiaoDichDat("GD002", "02/01/2022", 2000000, "B", 150));
//	ls.themGD(new GiaoDichDat("GD003", "03/01/2022", 3000000, "C", 100));
//	ls.themGD(new GiaoDichNha("GD004", "04/01/2022", 5000000, "cao cấp", "123 Đường ABC", 300));
}
