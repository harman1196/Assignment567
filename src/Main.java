package src;


import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Customer> custlist=new ArrayList<Customer>();
		Customer objcustomer1 =new Customer(10,"Harman","Singh","Harman Singh","harman@gmail.com");
		objcustomer1.insertion(new Mobile(3,"31/07/19","Mobile", 116, "Iphone XS", "Prepaid", "6476670240", 7, 250));
		objcustomer1.insertion(new Mobile(2,"31/07/19","Mobile", 116, "Iphone XS", "Prepaid", "6476670240", 7, 250));
		objcustomer1.insertion(new Mobile(1,"31/07/19","Mobile", 116, "Iphone XS", "Prepaid", "6476670240", 7, 250));
		
		Customer objcustomer2 =new Customer(2,"Harman","Singh","Harman Singh","harman@gmail.com");
		
		
		
		
		
		custlist.add(objcustomer1);
		custlist.add(objcustomer2);
		
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
