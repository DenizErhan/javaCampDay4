package Concrete;

import Abstract.*;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{
	
	private CustomerCheckService _customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService _customerCheckService) {
		this._customerCheckService = _customerCheckService;
	}
	
	@Override
	public void Save(Customer customer) throws Exception {
		if (_customerCheckService.CheckIfRealPerson(customer)) {
			super.Save(customer);
		}
		else {
			throw new Exception("Not a valid person.");
		}
		
	}

}
