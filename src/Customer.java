package src;

import java.util.ArrayList;

public class Customer implements IDisplay {

	private int CustomerId;
	private String firstName;
	private String lastName;
	private String fullName;
	private String emailId;
	private double totalAmount;
	private ArrayList<Bill> billList;

	public Customer(int CustomerId, String firstName, String lastName, String fullName, String emailId) {

		this.CustomerId = CustomerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.fullName = fullName;
		this.emailId = emailId;
		this.billList = new ArrayList<Bill>();

	}

	public void insertion(Bill Bill) {
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

	public double calcTotalAmount() {

		double totamount = 0;
		for (int i = 0; i < billList.size(); i++) {

			totamount = totamount + billList.get(i).getBillAmount();

		}

		return totamount;

	}

	public void sortBills() {

		int i, j, min_idx;

		// One by one move boundary of unsorted subarray
		for (i = 0; i < this.billList.size() - 1; i++) {
			// Find the minimum element in unsorted array
			min_idx = i;
			for (j = i + 1; j < this.billList.size(); j++)
				if (this.billList.get(j).getBillId() < this.billList.get(min_idx).getBillId()) {
					min_idx = j;
				}
			// Swap the found minimum element with the first element
			Bill billTemp = this.billList.get(i);
			this.billList.set(i, this.billList.get(min_idx));
			this.billList.set(min_idx, billTemp);

		}

	}

	@Override
	public void display() {
		// TODO Auto-generated method stub

		System.out.println("\n\nCustomer Id : " + this.getCustomerId() + "\nCustomer Full Name : " + this.getFullName()
				+ "\nCustomer Email ID : " + this.getEmailId());

		if (billList.size() > 0) {

			System.out.println("\n---- Bill Information ----" + "\n******************************************");

			this.sortBills();

			for (int i = 0; i < billList.size(); i++) {
				if (billList.get(i).getBillType() == "Mobile") {
					Mobile mobile = (Mobile) billList.get(i);

					String output1 = "Bill Id : " + mobile.getBillId() + "\n" + "Bill Date : " + mobile.getDate() + "\n"
							+ "Bill Type : " + mobile.getBillType() + "\n" + "Bill Amount : " + mobile.getBillAmount()
							+ "\n" + "Manufacturer Name : " + mobile.getManufactureName() + "\n" + "Plane Name : "
							+ mobile.getPlanName() + "\n" + "Mobile Number : " + mobile.getMobileNumber() + "\n"
							+ "Internet Usage : " + mobile.getDataUsed() + " GB\n" + "Minutes Usage : "
							+ mobile.getMinuteUsed() + " minutes";
					System.out.println(output1);

				} else if (billList.get(i).getBillType() == "Hydro") {
					Hydro hydro = (Hydro) billList.get(i);
					String output2 = "Bill Id : " + hydro.getBillId() + "\nBill Date : " + hydro.getDate()
							+ "\nBill Type : " + hydro.getBillType() + "\nBill Amount : " + hydro.getBillAmount()
							+ "\nAgency Name : " + hydro.getAgencyName() + "\nUnit Consumed :" + hydro.getUnitConsume()
							+ "units";
					System.out.println(output2);

				} else if (billList.get(i).getBillType() == "Internet") {

					Internet internet = (Internet) billList.get(i);

					String output3 = "\nBill Id : " + internet.getBillId() + "\nBill Date : " + internet.getDate()
							+ "\nBill Type : " + internet.getBillType() + "\nBill Amount : " + internet.getBillAmount()
							+ "\nProvider Name : " + internet.getProviderName() + "\nInternet Usage :"
							+ internet.getUsage() + "GB";
					System.out.println(output3);
				}
				System.out.println("******************************************");
			}
			System.out.println("******************************************");
			System.out.println("Total Bill Amount to Pay : $" + calcTotalAmount());
			System.out.println("******************************************");
		} else {
			System.out.println("~~~NOTE : This Customer has no bills");
		}

	}

}
