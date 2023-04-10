package bai5_trang37;

public class KhachHangNuocNgoai extends KhachHang {
private String quocTich;

public KhachHangNuocNgoai(String maKhachHang, String hoTen, String ngayLapHoaDon, double soKWTieuThu, double donGia, String quocTich) {
    super(maKhachHang, hoTen, ngayLapHoaDon, soKWTieuThu, donGia);
    this.quocTich = quocTich;
}

public String getQuocTich() {
    return quocTich;
}

public void setQuocTich(String quocTich) {
    this.quocTich = quocTich;
}

@Override
public double tinhThanhTien() {
    return getSoKWTieuThu() * getDonGia();
}


@Override
public String loaiKhachHang() {
	// TODO Auto-generated method stub
	return null;
}
}
