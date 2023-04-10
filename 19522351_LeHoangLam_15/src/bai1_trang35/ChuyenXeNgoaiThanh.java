package bai1_trang35;

public class ChuyenXeNgoaiThanh extends ChuyenXe {

	 private String noiDen;
	   private int soNgayDiDuoc;
	   
	   public ChuyenXeNgoaiThanh(String maSo, String hoTenTaiXe, String soXe, double doanhThu, String noiDen, int soNgayDiDuoc) {
	      super(maSo, hoTenTaiXe, soXe, doanhThu);
	      this.noiDen = noiDen;
	      this.soNgayDiDuoc = soNgayDiDuoc;
	   }
	   
	   public String getNoiDen() {
	      return noiDen;
	   }
	   
	   public int getSoNgayDiDuoc() {
	      return soNgayDiDuoc;
	   }

	public ChuyenXeNgoaiThanh(String maSo, String hoTenTaiXe, String soXe, double doanhThu) {
		super(maSo, hoTenTaiXe, soXe, doanhThu);
	}

	@Override
	public String toString() {
		return "ChuyenXeNgoaiThanh [noiDen=" + noiDen + ", soNgayDiDuoc=" + soNgayDiDuoc + "]";
	}
	   
	
}


