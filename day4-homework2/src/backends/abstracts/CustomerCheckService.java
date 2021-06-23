package backends.abstracts;

import backends.entities.Customer;

public interface CustomerCheckService {

	boolean checkIfRealPerson(Customer customer);
}
