package bai7_trang39;

import java.util.ArrayList;
//import java.util.Collections;
import java.util.List;

public class Main {
	private ArrayList<HangHoa> danhSachHangHoa;
    
    public Main(int n) {
        danhSachHangHoa = new ArrayList<>(n);
    }
    public static HangHoa timHangHoa(String keyword, List<HangHoa> products) {
        for (HangHoa product : products) {
            if (product.getMaHang().contains(keyword)) {
                return product;
            }
        }
        return null;
    }
    public boolean themHangHoa(HangHoa hh) {
        if (timHangHoa(hh.getMaHang()) == null) {
            danhSachHangHoa.add(hh);
            return true;
        }
        return false;
    }
    
    public void inToanBoDanhSach() {
        for (HangHoa hh : danhSachHangHoa) {
            System.out.println(hh);
        }
    }
    
//    public void inHangThucPham() {
//        for (HangHoa hh : danhSachHangHoa) {
//            if (hh instanceof ThucPham) {
//                System.out.println(hh);
//            }
//        }
//    }
    
//    public void inHangDienMay() {
//        for (HangHoa hh : danhSachHangHoa) {
//            if (hh instanceof DienMay) {
//                System.out.println(hh);
//            }
//        }
//    }
//    
//    public void inHangSanhSu() {
//        for (HangHoa hh : danhSachHangHoa) {
//            if (hh instanceof SanhSu) {
//                System.out.println(hh);
//            }
//        }
//    }
    
    public HangHoa timHangHoa(String maHang) {
        for (HangHoa hh : danhSachHangHoa) {
            if (hh.getMaHang().equals(maHang)) {
                return hh;
            }
        }
        return null;
    }
    
//    public void sapXepTheoTenHang() {
//        Collections.sort(danhSachHangHoa, Collections.reverseOrder() {
//            @Override
//            public int compare(HangHoa hh1, HangHoa hh2) {
//                return hh1.getTenHang().compareTo(hh2.getTenHang());
//            }
//        });
//    }
//    
//    public void sapXepTheoSoLuongTon() {
//        Collections.sort(danhSachHangHoa, new Comparator<HanhangHoagHoa>() {
//            @Override
//            public int compare(HangHoa hh1, HangHoa hh2) {
//                return Integer.compare(hh2.getSoLuongTon(), hh1.getSoLuongTon());
//            }
//        });
//    }
//    
//    public void xuatHangThucPhamKhoBan() {
//        for (HangHoa hh : danhSachHangHoa) {
//            if (hh instanceof ThucPham && hh.getSoLuongTon() < 10) {
//                System.out.println(hh);
//            }
//        }
//    }
//    
    public boolean xoaHangHoa(String maHang) {
    	HangHoa hh = timHangHoa(maHang);
        if (hh != null) {
            danhSachHangHoa.remove(hh);
            return true;
        }
        return false;
    }

}
