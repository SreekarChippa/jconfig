package application.jconfig.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.UniqueConstraint;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Account {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long accountId;
	
	@Column(unique=true)
	private long accountNumber;
	
	private String bankName;
	
	@ManyToOne
	private Vendor vendor;
	
	
	public Vendor getVendor() {
		return vendor;
	}
	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}
	public long getAccountId() {
		return accountId;
	}
	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", accountNumber=" + accountNumber + ", bankName=" + bankName
				+ ", vendor=" + vendor + "]";
	}
	
	
	
	

}
