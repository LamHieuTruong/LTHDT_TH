package bai5_trang37;

public class KhachHangVietNam extends KhachHang {
    private String doiTuongKH;
    private double dinhMuc;

    public KhachHangVietNam(String maKhachHang, String hoTen, String ngayLapHoaDon, double soKWTieuThu, double donGia, String doiTuongKH, double dinhMuc) {
        super(maKhachHang, hoTen, ngayLapHoaDon, soKWTieuThu, donGia);
        this.doiTuongKH = doiTuongKH;
        this.dinhMuc = dinhMuc;
    }

    public String getDoiTuongKH() {
        return doiTuongKH;
    }

    public double getDinhMuc() {
        return dinhMuc;
    }

    public double tinhThanhTien() {
        if (getSoKWTieuThu() <= dinhMuc) {
            return getSoKWTieuThu() * getDonGia();
        } else {
            return dinhMuc * getDonGia() + (getSoKWTieuThu() - dinhMuc) * getDonGia() * 2.5;
        }
    }

    public String loaiKhachHang() {
        return "Khách hàng Việt Nam";
    }

    public String toString() {
        return super.toString() + " - " + doiTuongKH + " - " + dinhMuc;
    }
}
