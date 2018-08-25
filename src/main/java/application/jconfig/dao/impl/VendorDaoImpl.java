package application.jconfig.dao.impl;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import application.jconfig.dao.VendorDao;
import application.jconfig.model.Vendor;

@Component
@Transactional
public class VendorDaoImpl implements VendorDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public boolean addVendor(Vendor vendor) {
		try
		{
		sessionFactory.getCurrentSession().save(vendor);
		return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public boolean updateVendor(Vendor vendor) {
		// TODO Auto-generated method stub
		try {
		sessionFactory.getCurrentSession().update(vendor);
		return true;
		}
		catch(Exception ex)
		{
		return false;
		}
		
	}

	public boolean deleteVendor(Vendor vendor) {
		// TODO Auto-generated method stub
		try {
		sessionFactory.getCurrentSession().delete(vendor);
		return true;
		}
		catch(Exception exception)
		{
		return false;	
		}
		
	}

	public Vendor getVendorById(int vid) {
		// TODO Auto-generated method stub
		try {
	 	return sessionFactory.getCurrentSession().get(Vendor.class, vid);
		}catch (HibernateException e) {
			// TODO: handle exception
			return null;
		}	
	}
	
}
