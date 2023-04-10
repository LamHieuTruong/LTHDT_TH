package bai5_trang37;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		 ArrayList<KhachHang> dsKhachHang = new ArrayList<KhachHang>();
	        dsKhachHang.add(new KhachHangVietNam("VN001", "Nguyen Van A", "01/09/2018", 2000, 50, "kinh doanh", 100));
	        dsKhachHang.add(new KhachHangVietNam("VN002", "Nguyen Van B", "05/09/2018", 2000, 100, "sinh hoat", 50));
	        dsKhachHang.add(new KhachHangVietNam("VN003", "Nguyen Van C", "10/09/2018", 2000, 150, "san xuat", 200));
	        dsKhachHang.add(new KhachHangNuocNgoai("NN001", "John Smith", "01/09/2018", 200, 3000, "USA"));
	        dsKhachHang.add(new KhachHangNuocNgoai("NN002", "Maria Garcia", "05/09/2018", 150, 3000, "Spain"));
	        dsKhachHang.add(new KhachHangNuocNgoai("NN003", "Marta Svensson", "10/09/2018", 100, 3000, "Sweden"));

	        // Tính tổng số lượng từng loại khách hàng
	        int tongSoLuongVietNam = 0;
	        int tongSoLuongNuocNgoai = 0;
	        for (KhachHang kh : dsKhachHang) {
	            if (kh instanceof KhachHangVietNam) {
	                tongSoLuongVietNam += kh.getSoKWTieuThu();
	            } else if (kh instanceof KhachHangNuocNgoai) {
	                tongSoLuongNuocNgoai += kh.getSoKWTieuThu();
	            }
	        }
	        System.out.println("Tổng số lượng khách hàng Việt Nam: " + tongSoLuongVietNam);
	        System.out.println("Tổng số lượng khách hàng nước ngoài: " + tongSoLuongNuocNgoai);
	     // Tính trung bình thành tiền của khách hàng nước ngoài
	        double tongThanhTienNuocNgoai = 0;
	        int soLuongKhachHangNuocNgoai = 0;

	        for (KhachHang khachHang : dsKhachHang) {
	            if (khachHang instanceof KhachHangNuocNgoai) {
	                tongThanhTienNuocNgoai += khachHang.tinhThanhTien();
	                soLuongKhachHangNuocNgoai++;
	            }
	        }

	        double trungBinhThanhTienNuocNgoai = tongThanhTienNuocNgoai / soLuongKhachHangNuocNgoai;

	        System.out.println("Trung bình thành tiền của khách hàng nước ngoài: " + trungBinhThanhTienNuocNgoai);

	        // Xuất ra các hóa đơn trong tháng 09/2018
//	        System.out.println("Các hóa đơn trong tháng 09/2018:");
//	        for (KhachHang khachHang : dsKhachHang) {
//	            if (khachHang.getNgayLapHoaDon().equals("09/2018")) {
//	                khachHang.hienThiThongTin();
//	                System.out.println("------------------------");
//	            }
//	        }

	}

}
