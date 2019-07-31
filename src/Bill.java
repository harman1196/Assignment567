
public class Bill {

	private int billId;
	private String date;
	private String billType;
	private double billAmount;
	
	public Bill( int billId,String date,String billType,double billAmount){
		
	this.billId=billId;
	this.date=date;
	this.billType=billType;
	this.billAmount=billAmount;
		
		
		
	}

	public int getBillId() {
		return billId;
	}

	public void setBillId(int billId) {
		this.billId = billId;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getBillType() {
		return billType;
	}

	public void setBillType(String billType) {
		this.billType = billType;
	}

	public double getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}
	
	
	
	
	
	
	
}
