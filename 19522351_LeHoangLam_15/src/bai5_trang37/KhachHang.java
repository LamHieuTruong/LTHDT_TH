package bai5_trang37;

public abstract class KhachHang {
    private String maKhachHang;
    private String hoTen;
    private String ngayLapHoaDon;
    private double soKWTieuThu;
    private double donGia;

    public KhachHang(String maKhachHang, String hoTen, String ngayLapHoaDon, double soKWTieuThu, double donGia) {
        this.maKhachHang = maKhachHang;
        this.hoTen = hoTen;
        this.ngayLapHoaDon = ngayLapHoaDon;
        this.soKWTieuThu = soKWTieuThu;
        this.donGia = donGia;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getNgayLapHoaDon() {
        return ngayLapHoaDon;
    }

    public double getSoKWTieuThu() {
        return soKWTieuThu;
    }

    public double getDonGia() {
        return donGia;
    }

    public abstract double tinhThanhTien();

    public abstract String loaiKhachHang();

    public String toString() {
        return maKhachHang + " - " + hoTen + " - " + ngayLapHoaDon + " - " + soKWTieuThu + " - " + donGia + " - " + tinhThanhTien();
    }
}

