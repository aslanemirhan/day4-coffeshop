package backends;



import backends.adapters.MernisServiceAdapter;
import backends.concretes.BaseCustomerManager;
import backends.concretes.NeroCustomerManager;
import backends.concretes.StarbucksCustomerManager;
import backends.entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		customer.setId(1);
		customer.setFirstName("Emirhan");
		customer.setLastName("Aslan");
		customer.setBirthOfDate(1998);
		customer.setNationalityId("41650607090");
		
//		BaseCustomerManager customerManager = new  NeroCustomerManager();
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(customer);

	}

}
