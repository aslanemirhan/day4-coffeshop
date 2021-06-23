package backends.concretes;

import backends.abstracts.CustomerCheckService;
import backends.entities.Customer;

public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {

		return true;
	}

}
