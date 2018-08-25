package application.jconfig.model.product;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

import application.jconfig.model.Product;

@Entity
@Component
public class Laptop extends Product{
	
	private int laptopRam;
	private int laptopRom;
	private String processor;
	private String os;

	public int getLaptopRam() {
		return laptopRam;
	}
	public void setLaptopRam(int laptopRam) {
		this.laptopRam = laptopRam;
	}
	public int getLaptopRom() {
		return laptopRom;
	}
	public void setLaptopRom(int laptopRom) {
		this.laptopRom = laptopRom;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	@Override
	public String toString() {
		return "Laptop [ laptopRam=" + laptopRam + ", laptopRom=" + laptopRom + ", processor="
				+ processor + ", os=" + os + "]";
	}
	
	

}
