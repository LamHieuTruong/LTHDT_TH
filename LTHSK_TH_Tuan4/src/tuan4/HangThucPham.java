package tuan4;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Locale;



public class HangThucPham {
	private String maTP;
	private String tenTP;
	private Calendar ngaySX, ngayHH;
	private double donGia;
	
	public String getMaTP() {
		return maTP;
	}
	public void setMaTP(String maTP) throws Exception {
		if (maTP!="") {
			this.maTP = maTP;
		}
		else throw new Exception("Ma San Pham Loi:");
	}
	public String getTenTP() {
		return tenTP;
	}
	public void setTenTP(String tenTP) throws Exception {
		if (tenTP!="") {
			this.tenTP = tenTP;
		}
		else throw new Exception("Ten San Pham sai:");
	}
	public Calendar getNgaySX() {
		return ngaySX;
	}
	public void setNgaySX(Calendar ngaySX) throws Exception {
		if (ngaySX!=null) {
			this.ngaySX = ngaySX;
		}
		else throw new Exception("Ngay San Xuat loi:");
	}
	public Calendar getNgayHH() {
		return ngayHH;
	}
	public void setNgayHH(Calendar ngayHH) throws Exception {
		if (ngayHH!=null) {
			this.ngayHH = ngayHH;
		}
		else throw new Exception("Ngay Het Han loi:");
	}
	public double getDonGia()  {
		return donGia;
	}
	public void setDonGia(double donGia) throws Exception {
		if (donGia>0) {
			this.donGia = donGia;
		}
		else throw new Exception("Don Gia loi:");
	}
	
	public HangThucPham(String maTP, String tenTP, Calendar ngaySX, Calendar ngayHH, double donGia) throws Exception {
		
		if (maTP!="") {
			this.maTP = maTP;
		}
		else throw new Exception("Ma San Pham Loi:");
		if (tenTP!="") {
			this.tenTP = tenTP;
		}
		else throw new Exception("Ten San Pham sai:");
		if (ngaySX!=null) {
			this.ngaySX = ngaySX;
		}
		else throw new Exception("Ngay San Xuat loi:");
		if (ngayHH!=null) {
			this.ngayHH = ngayHH;
		}
		else throw new Exception("Ngay Het Han loi:");
		if (donGia>0) {
			this.donGia = donGia;
		}
		else throw new Exception("Don Gia loi:");
	}
	
	
	public HangThucPham() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void tieuDe() {
		System.out.println("Test ket qua");
		
		for (int i = 0; i < 80; i++)
			System.out.printf("-");
		System.out.println();
		System.out.printf("|%-10s|%-13s|%-16s|%-10s|%-10s|\n", "Mã TP", "Tên TP", "Ngày SX","Ngày HH ","Đơn Gía");
		System.out.printf("|%-10s|%-10s|%14s|%10s|%10f|\n",getMaTP(),getTenTP(),df.format(getNgaySX()),df.format(getNgayHH()),sf.format(getDonGia()));
		for (int i = 0; i < 80; i++)
			System.out.printf("-");
		System.out.println();
		
		
	}
	Locale lc = new Locale("vi", "VN");
	DateFormat df = DateFormat.getDateInstance(1, lc);
	NumberFormat sf = NumberFormat.getCurrencyInstance(lc);
	@Override
	public String toString() {
		
		String s="";
		 s+=s.formatted("|%-10s|%-10s|%14s|%10s|%10s|\n",getMaTP(),getTenTP(),df.format(getNgaySX()),df.format(getNgayHH()),sf.format(getDonGia()));
		 return s;
	}
	
}
