package bai3_trang36;

import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

public abstract class GiaoDich {
    protected String maGiaoDich;
    protected Date ngayGiaoDich;
    protected double donGia;
    protected int soLuong;

    public GiaoDich(String maGiaoDich, String ngayGiaoDich, double donGia, int soLuong) throws ParseException {
        this.maGiaoDich = maGiaoDich;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        this.ngayGiaoDich = format.parse(ngayGiaoDich);
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    public double tinhThanhTien() {
        return soLuong * donGia;
    }

    public abstract String getLoai();

    public String getMaGiaoDich() {
        return maGiaoDich;
    }

    public Date getNgayGiaoDich() {
        return ngayGiaoDich;
    }

    public double getDonGia() {
        return donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

	public GiaoDich() {
		super();
	}

	@Override
	public String toString() {
		return "GiaoDich [maGiaoDich=" + maGiaoDich + ", ngayGiaoDich=" + ngayGiaoDich + ", donGia=" + donGia
				+ ", soLuong=" + soLuong + "]";
	}
    
}
