package application.jconfig.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import application.jconfig.dao.LaptopDao;
import application.jconfig.model.product.Laptop;

@Component
@Transactional
public class LaptopDaoImpl implements LaptopDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	public boolean addLaptop(Laptop laptop) {
		// TODO Auto-generated method stub
		try {
		sessionFactory.getCurrentSession().save(laptop);
			return true;
		}catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		
	}

	public boolean deleteLaptop(Laptop laptop) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().delete(laptop);
				return true;
			}catch (Exception e) {
				// TODO: handle exception
				return false;
			}
	}
	

}
