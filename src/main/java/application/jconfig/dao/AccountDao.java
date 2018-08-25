package application.jconfig.dao;

import application.jconfig.model.Account;

public interface AccountDao {
	public boolean addAccount(Account account);
	public boolean deleteAccount(Account account);

}
