package src;


public class Hydro extends Bill {

	private String agencyName;
	private double unitConsume;

	public Hydro(int billId, String date, String billType, double billAmount, String agencyName, double unitConsume) {
		super(billId, date, billType, billAmount);
		this.agencyName = agencyName;
		this.unitConsume = unitConsume;
	}

	

	public String getAgencyName() {
		return agencyName;
	}

	public void setAgencyName(String agencyName) {
		this.agencyName = agencyName;
	}

	public double getUnitConsume() {
		return unitConsume;
	}

	public void setUnitConsume(double unitConsume) {
		this.unitConsume = unitConsume;
	}

}
