package bai4_trang37;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// Tạo danh sách các giao dịch
        List<GiaoDich> danhSachGiaoDich = new ArrayList<>();

     // Thêm các giao dịch đất vào danh sách
        danhSachGiaoDich.add(new GiaoDichDat("GD001", LocalDate.of(2013, 1, 1), 1000000, 200, "A"));
        danhSachGiaoDich.add(new GiaoDichDat("GD002", LocalDate.of(2013, 1, 2), 2000000, 300, "B"));
        danhSachGiaoDich.add(new GiaoDichDat("GD003", LocalDate.of(2013, 1, 3), 3000000, 400, "C"));

     // Thêm các giao dịch nhà vào danh sách
        danhSachGiaoDich.add(new GiaoDichNha("GD004", LocalDate.of(2013, 1, 4), 4000000, 500, "123 đường ABC", "cao cấp"));
        danhSachGiaoDich.add(new GiaoDichNha("GD005", LocalDate.of(2013, 1, 5), 5000000, 600, "456 đường XYZ", "thường"));
        danhSachGiaoDich.add(new GiaoDichNha("GD006", LocalDate.of(2013, 1, 6), 6000000, 700, "789 đường QWE", "cao cấp"));

        // Tính tổng số lượng giao dịch đất và nhà
        int soLuongGiaoDichDat = 0;
        int soLuongGiaoDichNha = 0;

        for (GiaoDich giaoDich : danhSachGiaoDich) {
            if (giaoDich instanceof GiaoDichDat) {
                soLuongGiaoDichDat++;
            } else if (giaoDich instanceof GiaoDichNha) {
                soLuongGiaoDichNha++;
            }
        }

        System.out.println("Tổng số lượng giao dịch đất: " + soLuongGiaoDichDat);
        System.out.println("Tổng số lượng giao dịch nhà: " + soLuongGiaoDichNha);

        // Tính trung bình thành tiền của giao dịch đất
        double tongThanhTienDat = 0;
        int soLuongGiaoDichDatTinhTien = 0;

        for (GiaoDich giaoDich : danhSachGiaoDich) {
            if (giaoDich instanceof GiaoDichDat) {
                tongThanhTienDat += giaoDich.tinhThanhTien();
                soLuongGiaoDichDatTinhTien++;
            }
        }

        double trungBinhThanhTienDat = tongThanhTienDat / soLuongGiaoDichDatTinhTien;

        System.out.println("Trung bình thành tiền của giao dịch đất: " + trungBinhThanhTienDat);

        // Xuất ra các giao dịch


	}

}
