
public class StarbucksDatabaseManager extends MernisService{
	
	public void delete(StarbucksCustomerManager starbucksCustomer) {
		
		System.out.println(starbucksCustomer.firstName +" �simli Kullan�c� Veritaban�ndan Silindi");
		
	}

	public void save(StarbucksCustomerManager starbucksCustomerManager) {
		
		System.out.println(starbucksCustomerManager.firstName +" �simli Kullan�c� Veritaban�na Kay�t Edildi");
		boolean CheckPerson = MernisService.CheckService();
		
		if(CheckPerson == true) {
			System.out.println("Mernis Ba�ar�l�.");
		}
		else {
			System.out.println("Mernis Ba�ar�s�z.");
		}
		
		
	}
	
	
	}

	
	

