package application.jconfig.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import application.jconfig.dao.CategoryDao;
import application.jconfig.model.Category;

@Component
@Transactional
public class CategoryDaoImpl implements CategoryDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public boolean addCategory(Category category) {
		// TODO Auto-generated method stub
		try {
		sessionFactory.getCurrentSession().save(category);
			return true;
		}catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		
	}

}
