package bai1_trang35;

public class ChuyenXeNoiThanh extends ChuyenXe {
	private int soTuyen;
	private double soKmDiDuoc;

	public ChuyenXeNoiThanh(String maSo, String hoTenTaiXe, String soXe, double doanhThu, int soTuyen,
			double soKmDiDuoc) {
		super(maSo, hoTenTaiXe, soXe, doanhThu);
		this.soTuyen = soTuyen;
		this.soKmDiDuoc = soKmDiDuoc;
	}
	

	public ChuyenXeNoiThanh(String maSo, String hoTenTaiXe, String soXe, double doanhThu) {
		super(maSo, hoTenTaiXe, soXe, doanhThu);
	}


	public int getSoTuyen() {
		return soTuyen;
	}

	public double getSoKmDiDuoc() {
		return soKmDiDuoc;
	}


	@Override
	public String toString() {
		return "ChuyenXeNoiThanh [soTuyen=" + soTuyen + ", soKmDiDuoc=" + soKmDiDuoc + "]";
	}
	
	
}
