package bai2_trang35;

import java.util.ArrayList;
import java.util.Scanner;

class Sach {
    String maSach;
    String ngayNhap;
    double donGia;
    int soLuong;
    String nhaXuatBan;

    public Sach(String maSach, String ngayNhap, double donGia, int soLuong, String nhaXuatBan) {
        this.maSach = maSach;
        this.ngayNhap = ngayNhap;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.nhaXuatBan = nhaXuatBan;
    }

    public double tinhThanhTien() {
        return soLuong * donGia;
    }

	public String getMaSach() {
		return maSach;
	}

	public void setMaSach(String maSach) {
		this.maSach = maSach;
	}

	public String getNgayNhap() {
		return ngayNhap;
	}

	public void setNgayNhap(String ngayNhap) {
		this.ngayNhap = ngayNhap;
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public String getNhaXuatBan() {
		return nhaXuatBan;
	}

	public void setNhaXuatBan(String nhaXuatBan) {
		this.nhaXuatBan = nhaXuatBan;
	}

	public Sach() {
		super();
	}

	@Override
	public String toString() {
		return "Sach [maSach=" + maSach + ", ngayNhap=" + ngayNhap + ", donGia=" + donGia + ", soLuong=" + soLuong
				+ ", nhaXuatBan=" + nhaXuatBan + "]";
	}
	
    
}


