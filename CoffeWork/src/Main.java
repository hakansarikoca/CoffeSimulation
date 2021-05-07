
public class Main {

	public static void main(String[] args) {
		
		CustomerManager customerManager = new CustomerManager("Hakan", "Sarýkoca", 2002 , "00000000000");
		
		StarbucksCustomerManager starbucksCustomerManager = new StarbucksCustomerManager("Osman","Kaya",2000,"10000000000");

		NeroCustomerManager neroCustomerManager = new NeroCustomerManager("Kerim", "Ocak" , 1998 , "20000000000");
		
		StarbucksDatabaseManager starbucksDatabaseManager = new StarbucksDatabaseManager();
		
		NeroDatabaseManager neroDatabaseManager = new NeroDatabaseManager();
		
		starbucksDatabaseManager.save(starbucksCustomerManager);
		
		neroDatabaseManager.NeroDatabaseSave(neroCustomerManager);
		
		MernisService mernisService = new MernisService();
		
		StarbucksProduct starbucksProduct = new StarbucksProduct(starbucksCustomerManager);
		
	}

}
