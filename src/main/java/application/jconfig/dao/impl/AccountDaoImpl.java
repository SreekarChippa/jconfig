package application.jconfig.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import application.jconfig.dao.AccountDao;
import application.jconfig.model.Account;

@Component
@Transactional
public class AccountDaoImpl implements AccountDao{
	
	@Autowired
	private SessionFactory sessionFactory;

	public boolean addAccount(Account account) {
		// TODO Auto-generated method stub
		try {
		sessionFactory.getCurrentSession().save(account);
			return true;
		}
		catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		
	}

	public boolean deleteAccount(Account account) {
		// TODO Auto-generated method stub
		try {
		sessionFactory.getCurrentSession().delete(account);
			return true;
		}catch (Exception ex) {
			// TODO: handle exception
			return false;
		}
		
	}
	

}
