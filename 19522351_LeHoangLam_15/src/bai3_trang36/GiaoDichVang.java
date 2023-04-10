package bai3_trang36;

import java.text.ParseException;

public class GiaoDichVang extends GiaoDich {
    private String loaiVang;

    public GiaoDichVang(String maGiaoDich, String ngayGiaoDich, double donGia, int soLuong, String loaiVang) throws ParseException {
        super(maGiaoDich, ngayGiaoDich, donGia, soLuong);
        this.loaiVang = loaiVang;
    }

    public String getLoaiVang() {
        return loaiVang;
    }

    @Override
    public String getLoai() {
        return "Vàng";
    }

	public GiaoDichVang(String maGiaoDich, String ngayGiaoDich, double donGia, int soLuong) throws ParseException {
		super(maGiaoDich, ngayGiaoDich, donGia, soLuong);
	}

	@Override
	public String toString() {
		return "GiaoDichVang [loaiVang=" + loaiVang + "]";
	}
    
}
