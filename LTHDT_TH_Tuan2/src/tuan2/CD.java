package tuan2;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Locale;

public class CD {
	private String maCD;
	private String tuaCD;
	private Calendar ngayPH;
	private double donGia;
	private int soBH;

	public String getMaCD() {
		return maCD;
	}

	public void setMaCD(String maCD) throws Exception {
		if (maCD != "") {
			this.maCD = maCD;
		} else
			throw new Exception("Loi ma");
	}

	public String getTuaCD() {
		return tuaCD;
	}

	public void setTuaCD(String tuaCD) throws Exception {
		if (tuaCD != "") {
			this.tuaCD = tuaCD;
		} else
			throw new Exception("loi");
	}

	public Calendar getNgayPH() {
		return ngayPH;
	}

	public void setNgayPH(Calendar ngayPH) throws Exception {
		if (ngayPH != null) {
			this.ngayPH = ngayPH;
		} else
			throw new Exception("Loi ngay");
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	public int getSoBH() {
		return soBH;
	}

	public void setSoBH(int soBH) {
		this.soBH = soBH;
	}

	public CD() {
		Calendar c = Calendar.getInstance();
		this.maCD = "19522351";
		this.tuaCD = "Học Tiếng Anh";
		this.ngayPH = c;
		this.donGia = 100000;
		this.soBH = 20;

	}

	public CD(String maCD, String tuaCD, Calendar ngayPH, double donGia, int soBH) throws Exception {
		if (maCD != "") {
			this.maCD = maCD;
		} else
			throw new Exception("Loi ma");
		if (tuaCD != "") {
			this.tuaCD = tuaCD;
		} else
			throw new Exception("Loi");
		if (ngayPH != null) {
			this.ngayPH = ngayPH;
		} else
			throw new Exception("Loi ngay");
		if (soBH > 0) {
			this.soBH = soBH;
		} else
			throw new Exception("Loi so bai hat");

	}

	double getThanhTien() {
		return (getDonGia() * getSoBH());
	}

	public void tieuDe() {
		System.out.println("Test ket qua");
		for (int i = 0; i < 80; i++)
			System.out.printf("-");
		System.out.println();
		System.out.printf("|%-10s|%-13s|%-16s|%-10s|%-10s|%-12s|\n", "Mã CD", "Tựa CD", "Ngày Phát Hành", "Đơn Gía",
				"Số Bài Hát", "Tổng Tiền");
		System.out.printf("|%-10s|%-10s|%14s|%10s|%10s|%12s|\n",getMaCD(),getTuaCD(),df.format(getNgayPH().getTime()),sf.format(getDonGia()),getSoBH(),sf.format(getThanhTien()));
		for (int i = 0; i < 80; i++)
			System.out.printf("-");
		System.out.println();

	}

	Locale lc = new Locale("vi", "VN");
	DateFormat df = DateFormat.getDateInstance(1, lc);
	NumberFormat sf = NumberFormat.getCurrencyInstance(lc);
	public String toString() {
		String s="";
		 s+=s.formatted("|%-10s|%-10s|%14s|%10s|%12s|",getMaCD(),getTuaCD(),df.format(getNgayPH().getTime()),sf.format(getDonGia()),getSoBH(),sf.format(getThanhTien()));
		 return s;
	}
	
	
}
