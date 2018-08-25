package application.jconfig.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import application.jconfig.dao.ProductDao;
import application.jconfig.model.Product;

@Component
@Transactional
public class ProductDaoImpl implements ProductDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	public boolean addProduct(Product product) {
		// TODO Auto-generated method stub
		try {
		sessionFactory.getCurrentSession().save(product);
			return true;
		}catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		
	}

	public boolean deleteProduct(Product product) {
		// TODO Auto-generated method stub
		try {
		sessionFactory.getCurrentSession().delete(product);
			return true;
		}catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		
	}

}
