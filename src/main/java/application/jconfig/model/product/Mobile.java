package application.jconfig.model.product;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

import application.jconfig.model.Product;

@Entity
@Component
public class Mobile extends Product{

	private int mobileRam;
	private int mobileRom;
	private String processor;
	private int primaryCam;
	private int secondaryCam;
	

	public int getMobileRam() {
		return mobileRam;
	}
	public void setMobileRam(int mobileRam) {
		this.mobileRam = mobileRam;
	}
	public int getMobileRom() {
		return mobileRom;
	}
	public void setMobileRom(int mobileRom) {
		this.mobileRom = mobileRom;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public int getPrimaryCam() {
		return primaryCam;
	}
	public void setPrimaryCam(int primaryCam) {
		this.primaryCam = primaryCam;
	}
	public int getSecondaryCam() {
		return secondaryCam;
	}
	public void setSecondaryCam(int secondaryCam) {
		this.secondaryCam = secondaryCam;
	}
	@Override
	public String toString() {
		return "Mobile [mobileRam=" + mobileRam + ", mobileRom=" + mobileRom + ", processor="
				+ processor + ", primaryCam=" + primaryCam + ", secondaryCam=" + secondaryCam + "]";
	}
	
	
	
	

}
