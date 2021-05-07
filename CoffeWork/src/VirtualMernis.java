
public class VirtualMernis  {

	String firstName = "Osman";
	String lastName = "Kaya";
	int dateOfBirth =2000;
	String nationalityId ="10000000000";
	boolean mernisTrue = false;
	
	
	public void mernisInformation(StarbucksCustomerManager sbcustomer) {
		
		if (sbcustomer.dateOfBirth == dateOfBirth) {
			
			mernisTrue = true;
			

		}
		else mernisTrue = false;

		}
		
		
		
	}