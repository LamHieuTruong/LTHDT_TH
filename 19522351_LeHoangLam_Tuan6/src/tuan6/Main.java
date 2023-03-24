package tuan6;

public class Main {
	public static void main(String[] args) {
	    DanhSachCongNhan danhSach = new DanhSachCongNhan(5);

	    CongNhan cn1 = new CongNhan("CN001", "Le", "Hoang Lam", 100);
	    CongNhan cn2 = new CongNhan("CN002", "Tran", "Thi B", 250);
	    CongNhan cn3 = new CongNhan("CN003", "Le", "Quang C", 400);
	    CongNhan cn4 = new CongNhan("CN004", "Pham", "Thi D", 600);
	    CongNhan cn5 = new CongNhan("CN005", "Vu", "Van E", 800);

	    danhSach.themCongNhan(cn1);
	    danhSach.themCongNhan(cn2);
	    danhSach.themCongNhan(cn3);
	    danhSach.themCongNhan(cn4);
	    danhSach.themCongNhan(cn5);

	    System.out.println("Danh sach cong nhan:");
	    danhSach.xuatDanhSach();

	    System.out.println("So luong cong nhan: " + danhSach.demSoLuongCongNhan());

	    System.out.println("Cong nhan lam tren 200 san pham:");
	    danhSach.xuatCongNhanLamTren200SanPham();

	    System.out.println("Danh sach cong nhan sap xep giam dan theo so san pham:");
	    danhSach.sapXepCongNhanGiamDanTheoSoSP();
	    danhSach.xuatDanhSach();
	}


}
