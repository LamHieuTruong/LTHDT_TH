package bai3_trang36;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {

	public static void main(String[] args) throws ParseException {
		 ArrayList<GiaoDich> danhSachGiaoDich = new ArrayList<>();
		 danhSachGiaoDich.add(new GiaoDichVang("GD001", "2022-04-08", 5000000, 2, "18K"));
		 danhSachGiaoDich.add(new GiaoDichTienTe("GD002", "2022-04-08", 23000, 1000, 0.000043, "USD"));
		/// Tính tổng số lượng và trung bình thành tiền của giao dịch tiền tệ
		 double tongSoLuongTienTe = 0;
		 double tongThanhTienTienTe = 0;
		 int soGiaoDichTienTe = 0;

		 for (int i = 0; i < danhSachGiaoDich.size(); i++) {
		     if (danhSachGiaoDich.get(i) instanceof GiaoDichTienTe) {
		         GiaoDichTienTe gdtt = (GiaoDichTienTe) danhSachGiaoDich.get(i);
		         tongSoLuongTienTe += gdtt.getSoLuong();
		         if (gdtt.getLoaiTienTe().equals("USD") || gdtt.getLoaiTienTe().equals("Euro")) {
		             tongThanhTienTienTe += gdtt.getSoLuong() * gdtt.getDonGia() * gdtt.getTiGia();
		         } else if (gdtt.getLoaiTienTe().equals("VND")) {
		             tongThanhTienTienTe += gdtt.getSoLuong() * gdtt.getDonGia();
		         }
		         soGiaoDichTienTe++;
		     }
		 }

		 double trungBinhThanhTienTienTe = tongThanhTienTienTe / soGiaoDichTienTe;

		 // Xuất ra các giao dịch có đơn giá > 1 tỷ, dùng thuộc tính date format và number format để định dạng ngày và tiền tệ việt nam qua biến locale
		 NumberFormat numberFormat = NumberFormat.getCurrencyInstance(new Locale("vi", "VN"));
		 DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

		 System.out.println("Các giao dịch có đơn giá > 1 tỷ:");
		 for (int i = 0; i < danhSachGiaoDich.size(); i++) {
		     GiaoDich gd = danhSachGiaoDich.get(i);
		     if (gd.getDonGia() > 1000000000) {
		         String ngayGiaoDich = dateFormat.format(gd.getNgayGiaoDich());
		         String thanhTien = numberFormat.format(gd.tinhThanhTien());
		         System.out.println(gd.getMaGiaoDich() + "\t" + ngayGiaoDich + "\t" + thanhTien);
		     }
		 }
	}

}
