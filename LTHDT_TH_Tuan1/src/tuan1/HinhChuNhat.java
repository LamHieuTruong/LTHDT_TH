package tuan1;

public class HinhChuNhat {
	public double chieuDai;
	public double chieuRong;
	private void setChieuDai(double cd) throws Exception{
		if (cd > 0) {
			this.chieuDai=cd;
			
		}else throw new Exception("Chieu dai phai lon hon 0");
		// TODO Auto-generated method stub

	}
	public double getChieuDai() {
		return this.chieuDai;
		
	}
	private void setChieuRong(double cr) throws Exception {
		if (cr > 0) {
			this.chieuRong=cr;
			
			
		}else throw new Exception("Chieu rong phai lon hon 0");
		// TODO Auto-generated method stub

	}
	public double getChieuRong() {
		return this.chieuRong;
	
	}
	public HinhChuNhat() {
		
	}
	public HinhChuNhat(double cd, double cr) {
		this.chieuDai=cd;
		this.chieuRong=cr;
		
	}
	public double getChuVi() {
		return (getChieuDai()+getChieuRong())*2;
	}
	public double getDienTich() {
		return (getChieuDai()*getChieuRong());
		
		
	}
	public static void main(String[] args) throws Exception {
		HinhChuNhat h1 = new HinhChuNhat();
		h1.setChieuDai(5);
		h1.setChieuRong(3);
		System.out.println("Chieu dai da nhap:" + h1.getChieuDai());
		System.out.println("Chieu rong da nhap:" + h1.getChieuRong());
		System.out.println("Chu vi la:" + h1.getChuVi());
		System.out.println("Dien tich la:" + h1.getDienTich());
	
	}

}
