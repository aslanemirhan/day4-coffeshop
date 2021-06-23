package backends.adapters;

import java.util.Locale;

import backends.abstracts.CustomerCheckService;
import backends.entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		
		boolean result = true;
		
		try {
			result = client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),
					customer.getFirstName().toUpperCase(new Locale("tr")),
					customer.getLastName().toUpperCase(new Locale("tr")), customer.getBirthOfDate());
		} catch (Exception e) {

			e.printStackTrace();
		}

		return result;
		
	}

}
