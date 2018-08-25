package application.jconfig.model;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.UniqueConstraint;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Vendor {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long vid;
	
	@Column(unique=true)
	private String name;
	
	@Column(unique=true)
	private String email;
	
	@Column(unique=true)
	private String mobile;
	
	private String companyName;
	
	@OneToMany(mappedBy="vendor")
	private Set<Address> Addresses;
	
	@OneToMany(mappedBy="vendor")
	private Set<Account> accounts;
	
	@OneToMany(mappedBy="vendor")
	private List<Product> products;
	
	public long getVid() {
		return vid;
	}
	public void setVid(long vid) {
		this.vid = vid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	@Override
	public String toString() {
		return "Vendor [vid=" + vid + ", name=" + name + ", email=" + email + ", mobile=" + mobile + ", companyName="
				+ companyName + "]";
	}
	
	

}
