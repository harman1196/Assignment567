
public class Mobile extends Bill {

	private String manufactureName;
	private String planName;
	private String mobileNumber;
	private double dataUsed;
	private double minuteUsed;

	public Mobile(int billId, String date, String billType, double billAmount, String manufactureName, String planName,
			String mobileNumber, double dataUsed, double minuteUsed) {
		super(billId, date, billType, billAmount);
		this.manufactureName = manufactureName;
		this.planName = planName;
		this.mobileNumber = mobileNumber;
		this.dataUsed = dataUsed;
		this.minuteUsed = minuteUsed;

	}

	public String getManufactureName() {
		return manufactureName;
	}

	public void setManufactureName(String manufactureName) {
		this.manufactureName = manufactureName;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public double getDataUsed() {
		return dataUsed;
	}

	public void setDataUsed(double dataUsed) {
		this.dataUsed = dataUsed;
	}

	public double getMinuteUsed() {
		return minuteUsed;
	}

	public void setMinuteUsed(double minuteUsed) {
		this.minuteUsed = minuteUsed;
	}

}
