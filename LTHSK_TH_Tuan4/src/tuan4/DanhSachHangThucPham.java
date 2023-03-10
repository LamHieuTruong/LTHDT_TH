package tuan4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DanhSachHangThucPham {
	List<HangThucPham> ls;
	public DanhSachHangThucPham() {
		ls = new ArrayList<HangThucPham>(5);
	}
	public boolean themHTP(HangThucPham htp) {
		return ls.add(htp);
	}
	public HangThucPham timHTP(String maTP) {
		for (HangThucPham htp : ls) {
			if (htp.getMaTP().equalsIgnoreCase(maTP)==true)
				return htp;
		}
		return null;
	}
	public boolean capNhatHTP( String maTP, double dg) throws Exception {
		int viTri=-1;
		HangThucPham htp = timHTP(maTP);
		if(htp!= null) {
			((HangThucPham) htp).setDonGia(dg);
			viTri= ls.indexOf(htp);
			ls.add(viTri, htp);
		}
		return false;
	}
	public void sapXepHTP() {
		Collections.sort(ls, new Comparator<HangThucPham>() {
			public int compare(HangThucPham o1, HangThucPham o2)
			{
			String x= new String(o1.getMaTP());
			String y= new String(o2.getMaTP());
				return x.compareToIgnoreCase(y);
			}
		});
	}
	public List<HangThucPham> xuatHTP(){
		return ls;
		
	}
}


