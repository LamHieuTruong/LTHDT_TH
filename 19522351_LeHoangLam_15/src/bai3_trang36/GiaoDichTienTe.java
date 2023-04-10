package bai3_trang36;

import java.text.ParseException;

public class GiaoDichTienTe extends GiaoDich {
    private double tiGia;
    private String loaiTienTe;

    public GiaoDichTienTe(String maGiaoDich, String ngayGiaoDich, double donGia, int soLuong, double tiGia, String loaiTienTe) throws ParseException {
        super(maGiaoDich, ngayGiaoDich, donGia, soLuong);
        this.tiGia = tiGia;
        this.loaiTienTe = loaiTienTe;
    }

    public double getTiGia() {
        return tiGia;
    }

    public String getLoaiTienTe() {
        return loaiTienTe;
    }

    @Override
    public String getLoai() {
        return "Tiền tệ";
    }
    

    @Override
	public String toString() {
		return "GiaoDichTienTe [tiGia=" + tiGia + ", loaiTienTe=" + loaiTienTe + "]";
	}

	public GiaoDichTienTe(String maGiaoDich, String ngayGiaoDich, double donGia, int soLuong) throws ParseException {
		super(maGiaoDich, ngayGiaoDich, donGia, soLuong);
	}

	@Override
    public double tinhThanhTien() {
        if (loaiTienTe.equals("USD") || loaiTienTe.equals("Euro")) {
            return soLuong * donGia * tiGia;
        } else {
            return super.tinhThanhTien();
        }
    }
}
