package tuan6;

import java.util.List;
import java.util.Scanner;

public class DanhSachCongNhan {
	private CongNhan[] danhSach;
    private int soLuong;
    private final int MAX_SIZE;

    public DanhSachCongNhan(int maxSize) {
        danhSach = new CongNhan[maxSize];
        soLuong = 0;
        MAX_SIZE = maxSize;
    }

    public boolean themCongNhan(CongNhan cn) {
        if (soLuong >= MAX_SIZE) {
            return false; // danh sách đã đầy
        }

        danhSach[soLuong] = cn;
        soLuong++;
        return true;
    }

    public void xuatDanhSach() {
        for (int i = 0; i < soLuong; i++) {
            System.out.println(danhSach[i].toString());
        }
    }

    public int demSoLuongCongNhan() {
        return soLuong;
    }

    public void xuatCongNhanLamTren200SanPham() {
        System.out.println("Cac cong nhan lam tren 200 san pham:");
        for (int i = 0; i < soLuong; i++) {
            if (danhSach[i].getmSoSP() > 200) {
                System.out.println(danhSach[i].toString());
            }
        }
    }

    public void sapXepCongNhanGiamDanTheoSoSP() {
        for (int i = 0; i < soLuong - 1; i++) {
            for (int j = i + 1; j < soLuong; j++) {
                if (danhSach[i].getmSoSP() < danhSach[j].getmSoSP()) {
                    CongNhan temp = danhSach[i];
                    danhSach[i] = danhSach[j];
                    danhSach[j] = temp;
                }
            }
        }
    }
}
	


