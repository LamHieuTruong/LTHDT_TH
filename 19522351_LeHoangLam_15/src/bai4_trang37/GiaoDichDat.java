package bai4_trang37;

import java.time.LocalDate;

public class GiaoDichDat extends GiaoDich {
    private String loaiDat;

    public GiaoDichDat(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, double dienTich, String loaiDat) {
        super(maGiaoDich, ngayGiaoDich, donGia, dienTich);
        this.loaiDat = loaiDat;
        this.thanhTien = tinhThanhTien();
    }

    @Override
    public double tinhThanhTien() {
        if (loaiDat.equals("A")) {
            return dienTich * donGia * 1.5;
        } else {
            return dienTich * donGia;
        }
    }

    @Override
    public String toString() {
        return "GiaoDichDat{" +
                "maGiaoDich='" + maGiaoDich + '\'' +
                ", ngayGiaoDich=" + ngayGiaoDich +
                ", donGia=" + donGia +
                ", dienTich=" + dienTich +
                ", thanhTien=" + thanhTien +
                ", loaiDat='" + loaiDat + '\'' +
                '}';
    }
}
