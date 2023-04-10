package bai4_trang37;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GiaoDich {
    protected String maGiaoDich;
    protected LocalDate ngayGiaoDich;
    protected double donGia;
    protected double dienTich;
    protected double thanhTien;

    public GiaoDich(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, double dienTich) {
        this.maGiaoDich = maGiaoDich;
        this.ngayGiaoDich = ngayGiaoDich;
        this.donGia = donGia;
        this.dienTich = dienTich;
    }

    public double tinhThanhTien() {
        return 0;
    }

    @Override
    public String toString() {
        return "GiaoDich{" +
                "maGiaoDich='" + maGiaoDich + '\'' +
                ", ngayGiaoDich=" + ngayGiaoDich +
                ", donGia=" + donGia +
                ", dienTich=" + dienTich +
                ", thanhTien=" + thanhTien +
                '}';
    }
}
