package application.jconfig.dao;

import application.jconfig.model.Product;

public interface ProductDao {
	public boolean addProduct(Product product);
	public boolean deleteProduct(Product product);

}
