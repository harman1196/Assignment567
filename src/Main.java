package src;


import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Customer> custlist=new ArrayList<Customer>();
		Customer objcustomer1 =new Customer(1,"Harman","Singh","Harman Singh","harman@gmail.com");
		objcustomer1.insertion(new Mobile(3,"31/07/19","Mobile", 117, "Iphone XS", "Prepaid", "6476670240", 7, 250));
		objcustomer1.insertion(new Internet(1, "31/07/19", "Internet", 150, "Rogers", 25));
		objcustomer1.insertion(new Hydro(12, "30/07/19", "Hydro", 109, "TorontoHydro", 115));
		
		Customer objcustomer2 =new Customer(3,"Harman","Singh","Harman Singh","harman@gmail.com");
		
		Customer objcustomer3=new Customer(2,"Monnu","Patialavi","Monnu Patialavi","monnu.patiala@gmail.com");
		objcustomer3.insertion(new Internet(143,"07/08/19","Internet",156,"Bell",24));
		objcustomer3.insertion(new Hydro(132,"01/08/19","Hydro",170,"Raptors",121));
		
		custlist.add(objcustomer1);
		custlist.add(objcustomer2);
		custlist.add(objcustomer3);
		
		sortCustomers(custlist);
		
		
		
		for(int i=0; i < custlist.size() ; i++) {
			
			
			custlist.get(i).display();
			
		}
		
	}
	
	public static ArrayList<Customer> sortCustomers(ArrayList<Customer> custlist) {		
			
			 int i, j, min_idx;  
			  
			    // One by one move boundary of unsorted subarray  
			    for (i = 0; i < custlist.size()-1; i++)  
			    {  
			        // Find the minimum element in unsorted array  
			        min_idx = i;  
			        for (j = i+1; j < custlist.size(); j++)  
			        if (custlist.get(j).getCustomerId() < custlist.get(min_idx).getCustomerId()) { 
			            min_idx = j;  
			        }
			        // Swap the found minimum element with the first element  
			        Customer custtemp = custlist.get(i);
			        custlist.set(i, custlist.get(min_idx));
			        custlist.set(min_idx, custtemp);
			      
				
			}
			    return custlist;
		
		
	}
	

}
