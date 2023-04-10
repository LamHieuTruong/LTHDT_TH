package bai2_trang35;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// Tạo danh sách sách
		ArrayList<Sach> danhSachSach = new ArrayList<>();

		// Thêm sách giáo khoa vào danh sách
		SachGiaoKhoa sgk1 = new SachGiaoKhoa("SGK001", "01/01/2022", 50000, 100, "NXB A", "mới");
		SachGiaoKhoa sgk2 = new SachGiaoKhoa("SGK002", "01/01/2022", 40000, 50, "NXB B", "cũ");
		SachGiaoKhoa sgk3 = new SachGiaoKhoa("SGK003", "01/01/2022", 60000, 70, "NXB A", "mới");
		danhSachSach.add(sgk1);
		danhSachSach.add(sgk2);
		danhSachSach.add(sgk3);

		// Thêm sách tham khảo vào danh sách
		SachThamKhao stk1 = new SachThamKhao("STK001", "01/01/2022", 150000, 20, "NXB C", 5000);
		SachThamKhao stk2 = new SachThamKhao("STK002", "01/01/2022", 120000, 30, "NXB D", 8000);
		SachThamKhao stk3 = new SachThamKhao("STK003", "01/01/2022", 100000, 25, "NXB C", 6000);
		danhSachSach.add(stk1);
		danhSachSach.add(stk2);
		danhSachSach.add(stk3);

		// Tính tổng thành tiền của từng loại sách
		double tongThanhTienSachGiaoKhoa = 0;
		double tongThanhTienSachThamKhao = 0;
		for (Sach sach : danhSachSach) {
			if (sach instanceof SachGiaoKhoa) {
				tongThanhTienSachGiaoKhoa += sach.tinhThanhTien();
			} else if (sach instanceof SachThamKhao) {
				tongThanhTienSachThamKhao += sach.tinhThanhTien();
			}
		}

		System.out.println("Tổng thành tiền sách giáo khoa: " + tongThanhTienSachGiaoKhoa);
		System.out.println("Tổng thành tiền sách tham khảo: " + tongThanhTienSachThamKhao);
		// Tính trung bình cộng đơn giá của sách tham khảo
		double tongDonGiaSachThamKhao = 0;
		int soLuongSachThamKhao = 0;
		for (Sach sach : danhSachSach) {
			if (sach instanceof SachThamKhao) {
				tongDonGiaSachThamKhao += sach.donGia;
				soLuongSachThamKhao += sach.soLuong;
			}
		}
		double trungBinhCongDonGia = tongDonGiaSachThamKhao / soLuongSachThamKhao;
		System.out.println("Trung binh cong don gia sach tham khao: " + trungBinhCongDonGia);

	}

}
