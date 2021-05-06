package javaCampHW4x2;

import java.util.*;
import java.rmi.RemoteException;
import MernisServiceReference.*;
import Abstract.*;
import Adapters.MernisServiceAdapter;
import Concrete.*;
import Entities.*;

public class Main {

	public static void main(String[] args) throws Exception {
		Date dateOfBirth=new Date(1996,2,23);
		BaseCustomerManager customerManager=new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.Save(new Customer(1,"Deniz","Erhan",dateOfBirth,"16498423962"));
	}
}
