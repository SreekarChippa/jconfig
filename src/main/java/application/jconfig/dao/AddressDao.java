package application.jconfig.dao;

import application.jconfig.model.Address;

public interface AddressDao {
	
	public boolean addAddress(Address address);
	public boolean deleteAddress(Address address);

}
