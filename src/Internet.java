
public class Internet extends Bill {

	private String providerName;
	private double usage;

	public Internet(int billId, String date, String billType, double billAmount, String providerName, double usage) {
		super(billId, date, billType, billAmount);
		this.providerName = providerName;
		this.usage = usage;
	}

	public String getProviderName() {
		return providerName;
	}

	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}

	public double getUsage() {
		return usage;
	}

	public void setUsage(double usage) {
		this.usage = usage;
	}

}
