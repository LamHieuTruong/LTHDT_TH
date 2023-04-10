package bai6_trang45;

public class PhongThucHanh extends Phong{
	private int numOfComputers;

	public PhongThucHanh() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PhongThucHanh(String roomCode, String building, double area, int numOfLights) {
		super(roomCode, building, area, numOfLights);
		// TODO Auto-generated constructor stub
	}

	public PhongThucHanh(String roomCode, String building, double area, int numOfLights, int numOfComputers) {
		super(roomCode, building, area, numOfLights);
		this.numOfComputers = numOfComputers;
	}

	public int getNumOfComputers() {
		return numOfComputers;
	}

	public void setNumOfComputers(int numOfComputers) {
		this.numOfComputers = numOfComputers;
	}
	public int NumOfComputers() {
        return this.numOfComputers;
    }
	@Override
	public String toString() {
		String s ="";
		s+=String.format("|%10s|", getNumOfComputers());
		return super.toString()+s;
	}
}
