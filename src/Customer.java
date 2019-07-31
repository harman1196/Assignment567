import java.util.ArrayList;

public class Customer implements IDisplay {
	
	
	private int CustomerId;
	private String firstName;
	private String lastName;
	private String fullName ;
	private String emailId;
	private double totalAmount;
	private ArrayList<Bill> billList; 
	
	public Customer(int CustomerId,String firstName,String lastName,String fullName,String emailId){
		
		this.CustomerId = CustomerId;
		this.firstName=firstName;
		this.lastName=lastName;
		this.fullName=fullName;
		this.emailId=emailId;
		this.billList=new ArrayList<Bill>();
		
	}
	
	public void insertion(Bill Bill){
		this.billList.add(Bill);
	}

	public int getCustomerId() {
		return CustomerId;
	}

	public void setCustomerId(int customerId) {
		CustomerId = customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public ArrayList<Bill> getBillList() {
		return billList;
	}

	public void setBillList(ArrayList<Bill> billList) {
		this.billList = billList;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		for(int i=0;i<billList.size();i++){
			if(billList.get(i).getBillType()=="Mobile")
			{
				Mobile mobile=(Mobile) billList.get(i);
				
				String output="Bill Id : "+mobile.getBillId()+"\n"
						+ "Bill Date : "+mobile.getDate()+"\n"
						+ "Bill Type : "+mobile.getBillType()+"\n"
						+ "Bill Amount : "+mobile.getBillAmount()+"\n"
						+ "Manufacturer Name : "+ mobile.getManufactureName()+"\n"
						+ "Plane Name : "+mobile.getPlanName()+"\n"
						+ "Mobile Number : "+mobile.getMobileNumber()+"\n"
						+ "Internet Usage : "+mobile.getDataUsed()+" GB\n"
						+ "Minutes Usage : "+mobile.getMinuteUsed()+" minutes";
						System.out.println(output);
			
			}
			else if(billList.get(i).getBillType()=="Hydro")
			{
				Hydro hydro=(Hydro) billList.get(i);
				String output2="Bill Id : "+ hydro.getBillId()+"\n"
						+ "Bill Date : "+ hydro.getDate()+"\n"
						+ "Bill Type : "+ hydro.getBillType()+"\n"
						+ "Bill Amount : "+ hydro.getBillAmount();
				
				
				
			}
			
		}
	}

}
