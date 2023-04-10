package bai4_trang37;

import java.time.LocalDate;

public class GiaoDichNha extends GiaoDich {
    private String loaiNha;
    private String diaChi;
    public GiaoDichNha(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, double dienTich, String loaiNha, String diaChi) {
        super(maGiaoDich, ngayGiaoDich, donGia, dienTich);
        this.loaiNha = loaiNha;
        this.diaChi = diaChi;
        this.thanhTien = tinhThanhTien();
    }

    @Override
    public double tinhThanhTien() {
        if (loaiNha.equals("cao cấp")) {
            return dienTich * donGia;
        } else {
            return dienTich * donGia * 0.9;
        }
    }

    @Override
    public String toString() {
        return "GiaoDichNha{" +
                "maGiaoDich='" + maGiaoDich + '\'' +
                ", ngayGiaoDich=" + ngayGiaoDich +
                ", donGia=" + donGia +
                ", dienTich=" + dienTich +
                ", thanhTien=" + thanhTien +
                ", loaiNha='" + loaiNha + '\'' +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }
}
