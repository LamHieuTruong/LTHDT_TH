package bai1_trang35;

public class ChuyenXe {
	protected String maSo;
	protected String hoTenTaiXe;
	protected String soXe;
	protected double doanhThu;

	public ChuyenXe(String maSo, String hoTenTaiXe, String soXe, double doanhThu) {
		this.maSo = maSo;
		this.hoTenTaiXe = hoTenTaiXe;
		this.soXe = soXe;
		this.doanhThu = doanhThu;
	}
	

	public ChuyenXe() {
		super();
	}


	public String getMaSo() {
		return maSo;
	}

	public String getHoTenTaiXe() {
		return hoTenTaiXe;
	}

	public String getSoXe() {
		return soXe;
	}

	public double getDoanhThu() {
		return doanhThu;
	}


	@Override
	public String toString() {
		return "ChuyenXe [maSo=" + maSo + ", hoTenTaiXe=" + hoTenTaiXe + ", soXe=" + soXe + ", doanhThu=" + doanhThu
				+ "]";
	}
	
}




