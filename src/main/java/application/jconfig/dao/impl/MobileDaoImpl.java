package application.jconfig.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import application.jconfig.dao.MobileDao;
import application.jconfig.model.product.Mobile;

@Component
@Transactional
public class MobileDaoImpl implements MobileDao{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public boolean addMobile(Mobile mobile) {
		// TODO Auto-generated method stub
		try {
		sessionFactory.getCurrentSession().save(mobile);
			return true;
		}catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		
	}

	public boolean deleteMobile(Mobile mobile) {
		try {
		sessionFactory.getCurrentSession().delete(mobile);
			return true;
		}catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}

}
