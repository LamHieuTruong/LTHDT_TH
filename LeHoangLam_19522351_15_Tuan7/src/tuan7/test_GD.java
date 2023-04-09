package tuan7;

import java.util.List;

public class test_GD {

	public static void main(String[] args) {
		 List<GiaoDich> ls = new ArrayList<>();
		 
		ls.add(new GiaoDichDat("GD001", "01/01/2022", 1000000, "A", 200));
		ls.add(new GiaoDichDat("GD002", "02/01/2022", 2000000, "B", 150));
		ls.add(new GiaoDichDat("GD003", "03/01/2022", 3000000, "C", 100));
		ls.add(new GiaoDichNha("GD004", "04/01/2022", 5000000, "cao cấp", "123 Đường ABC", 300));
	}

}
