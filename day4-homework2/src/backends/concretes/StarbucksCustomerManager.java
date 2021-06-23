package backends.concretes;

import backends.abstracts.CustomerCheckService;
import backends.entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{

	private CustomerCheckService check;

	public StarbucksCustomerManager(CustomerCheckService check) {
		super();
		this.check = check;
	}
	
	@Override
	public void save(Customer customer) {
		
		if(check.checkIfRealPerson(customer)) {
			super.save(customer);
		}else {
			System.out.println("Not a valid person!!!");
		}
		
	}
	
	
}
