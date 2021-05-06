package Adapters;

import java.rmi.RemoteException;

import Abstract.*;
import Entities.Customer;
import MernisServiceReference.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService{

	@SuppressWarnings("deprecation")
	@Override
	public Boolean CheckIfRealPerson(Customer customer) {
		long tc=new Long(customer.nationalityId);
		KPSPublicSoapProxy client=new KPSPublicSoapProxy();
		try {
			return client.TCKimlikNoDogrula(tc, customer.firstName.toUpperCase(), customer.lastName.toUpperCase(), (int)customer.dateOfBirth.getYear());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
