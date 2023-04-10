package bai1_trang35;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// Khởi tạo danh sách chuyến xe
	    ArrayList<ChuyenXe> danhSach = new ArrayList<>();
	    
	    // Tạo sẵn các chuyến xe
	    ChuyenXeNoiThanh cx1 = new ChuyenXeNoiThanh("CX001", "Tai xe 1", "01A-12345", 1500000, 1, 50);
	    ChuyenXeNoiThanh cx2 = new ChuyenXeNoiThanh("CX002", "Tai xe 2", "02B-56789", 2000000, 2, 70);
	    ChuyenXeNgoaiThanh cx3 = new ChuyenXeNgoaiThanh("CX003", "Tai xe 3", "03C-24680", 2500000, "Da Nang", 3);
	    ChuyenXeNgoaiThanh cx4 = new ChuyenXeNgoaiThanh("CX004", "Tai xe 4", "04D-13579", 3000000, "Nha Trang", 4);
	    
	    // Thêm các chuyến xe vào danh sách
	    danhSach.add(cx1);
	    danhSach.add(cx2);
	    danhSach.add(cx3);
	    danhSach.add(cx4);
	    
	    // Tính tổng doanh thu cho tất cả các chuyến xe
	    double tongDoanhThu = 0;
	    for (ChuyenXe cx : danhSach) {
	        tongDoanhThu += cx.getDoanhThu();
	    }
	    System.out.println("Tong doanh thu: " + tongDoanhThu);
	    
	    // Tính tổng doanh thu cho từng loại chuyến xe
	    double tongDoanhThuNoiThanh = 0;
	    double tongDoanhThuNgoaiThanh = 0;
	    for (ChuyenXe cx : danhSach) {
	        if (cx instanceof ChuyenXeNoiThanh) {
	            tongDoanhThuNoiThanh += cx.getDoanhThu();
	        } else if (cx instanceof ChuyenXeNgoaiThanh) {
	            tongDoanhThuNgoaiThanh += cx.getDoanhThu();
	        }
	    }
	    System.out.println("Tong doanh thu noi thanh: " + tongDoanhThuNoiThanh);
	    System.out.println("Tong doanh thu ngoai thanh: " + tongDoanhThuNgoaiThanh);

	}

}
