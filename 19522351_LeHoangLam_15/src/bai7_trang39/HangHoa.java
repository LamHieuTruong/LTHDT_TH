package bai7_trang39;


import java.util.ArrayList;
import java.util.Objects;

public class HangHoa {
	protected String maHang;
    protected String tenHang;
    protected double donGia;
    protected int soLuongTon;
    
	public String getMaHang() {
		return maHang;
	}
	public void setMaHang(String maHang) {
		this.maHang = maHang;
	}
	public String getTenHang() {
		return tenHang;
	}
	public void setTenHang(String tenHang) {
		this.tenHang = tenHang;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	public int getSoLuongTon() {
		return soLuongTon;
	}
	public void setSoLuongTon(int soLuongTon) {
		this.soLuongTon = soLuongTon;
	}
	@Override
	public int hashCode() {
		return Objects.hash(donGia, maHang, soLuongTon, tenHang);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HangHoa other = (HangHoa) obj;
		return Double.doubleToLongBits(donGia) == Double.doubleToLongBits(other.donGia)
				&& Objects.equals(maHang, other.maHang) && soLuongTon == other.soLuongTon
				&& Objects.equals(tenHang, other.tenHang);
	}
	public HangHoa() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HangHoa(String maHang, String tenHang, double donGia, int soLuongTon) {
		super();
		this.maHang = maHang;
		this.tenHang = tenHang;
		this.donGia = donGia;
		this.soLuongTon = soLuongTon;
	}
    
	public void danhGiaMucDoBanBuon() {
	}
	
	
	@Override
	public String toString() {
		String s= "";
		s+=String.format("|%10s|%10s|%10f|%10f|", getMaHang(), getTenHang(), getDonGia(), getSoLuongTon());
		return s;
	}
	public ArrayList<HangHoa> getName() {
		// TODO Auto-generated method stub
		return null;
	}
}
