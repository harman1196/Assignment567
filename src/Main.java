import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer objcustomer =new Customer(1,"Harman","Singh","Harman Singh","harman@gmail.com");
		ArrayList<Customer> objcustomer1=new ArrayList<Customer>();
		objcustomer1.add(objcustomer);
		objcustomer.insertion(new Mobile(1,"31/07/19","Mobile", 116, "Iphone XS", "Prepaid", "6476670240", 7, 250));
		objcustomer.display();
		
	}

}
