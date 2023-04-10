package bai2_trang35;

public class SachThamKhao extends Sach {
    private double thue;

    public SachThamKhao(String maSach, String ngayNhap, double donGia, int soLuong, String nhaXuatBan, double thue) {
        super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
        this.thue = thue;
    }

    public double getThue() {
        return thue;
    }

    public void setThue(double thue) {
        this.thue = thue;
    }
    

    public SachThamKhao(String maSach, String ngayNhap, double donGia, int soLuong, String nhaXuatBan) {
		super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
	}

	@Override
    public double tinhThanhTien() {
        return getSoLuong() * getDonGia() + thue;
    }

	@Override
	public String toString() {
		return "SachThamKhao [thue=" + thue + "]";
	}
	
}
