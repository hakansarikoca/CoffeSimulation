
public class StarbucksDatabaseManager extends MernisService{
	
	public void delete(StarbucksCustomerManager starbucksCustomer) {
		
		System.out.println(starbucksCustomer.firstName +" Ýsimli Kullanýcý Veritabanýndan Silindi");
		
	}

	public void save(StarbucksCustomerManager starbucksCustomerManager) {
		
		System.out.println(starbucksCustomerManager.firstName +" Ýsimli Kullanýcý Veritabanýna Kayýt Edildi");
		boolean CheckPerson = MernisService.CheckService();
		
		if(CheckPerson == true) {
			System.out.println("Mernis Baþarýlý.");
		}
		else {
			System.out.println("Mernis Baþarýsýz.");
		}
		
		
	}
	
	
	}

	
	

