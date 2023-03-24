package tuan6;

public class CongNhan {
	private String maCN;
	private String mHo;
	private String mTen;
	private int mSoSP;

	public String getMaCN() {
		return maCN;
	}

	public void setMaCN(String maCN) {
		this.maCN = maCN;
	}

	public String getmHo() {
		return mHo;
	}

	public void setmHo(String mHo) {
		this.mHo = mHo;
	}

	public String getmTen() {
		return mTen;
	}

	public void setmTen(String mTen) {
		this.mTen = mTen;
	}

	public int getmSoSP() {
		return mSoSP;
	}

	public void setmSoSP(int mSoSP) {
		this.mSoSP = mSoSP;
	}

	public CongNhan(int mSoSP) {
		if (mSoSP > 0) {
			this.mSoSP = mSoSP;
		}
	}

	public CongNhan(String maCN, String mHo, String mTen, int mSoSP) {
		super();
		this.maCN = maCN;
		this.mHo = mHo;
		this.mTen = mTen;
		this.mSoSP = mSoSP;
	}

	double getTinhLuong() {
			if(mSoSP < 200) {
				return mSoSP*0.5;
			}else {
				if (mSoSP >= 200 && mSoSP < 400) {
					return 199*0.5+((mSoSP-199)*0.55);
				}else {
					if (mSoSP >= 400 && mSoSP < 600) {
						return 199*0.5+((mSoSP-199)*0.55)+((mSoSP-399)*0.6);
					}else {
						if (mSoSP >= 600) {
							return 199*0.5+((mSoSP-199)*0.55)+((mSoSP-399)*0.6)+((mSoSP-599)*0.65);
						}
					}
				}
			
		}
		
		return getTinhLuong();		
	}

	@Override
	public String toString() {
		return "CongNhan [maCN=" + maCN + ", mHo=" + mHo + ", mTen=" + mTen + ", mSoSP=" + mSoSP + "]";
	}
	

}
