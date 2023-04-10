package bai2_trang35;

public class SachGiaoKhoa extends Sach {
    private String tinhTrang;

    public SachGiaoKhoa(String maSach, String ngayNhap, double donGia, int soLuong, String nhaXuatBan, String tinhTrang) {
        super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
        this.tinhTrang = tinhTrang;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }
    

    public SachGiaoKhoa(String maSach, String ngayNhap, double donGia, int soLuong, String nhaXuatBan) {
		super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
	}

	@Override
    public double tinhThanhTien() {
        if (tinhTrang.equals("mới")) {
            return getSoLuong() * getDonGia();
        } else if (tinhTrang.equals("cũ")) {
            return getSoLuong() * getDonGia() * 0.5;
        }
        return 0;
    }

	@Override
	public String toString() {
		return "SachGiaoKhoa [tinhTrang=" + tinhTrang + "]";
	}
	
}




