package backends.concretes;

import backends.abstracts.CustomerService;
import backends.entities.Customer;

public abstract class BaseCustomerManager implements CustomerService{

	@Override
	public void save(Customer customer) {
		
		System.out.println("Add to database : " + customer.getFirstName() + " " + customer.getLastName());
	}

}
