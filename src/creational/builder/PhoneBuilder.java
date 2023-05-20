package creational.builder;

public class PhoneBuilder {
	private  int price;
	private  int RAM;
	private  int battery;
	private double Screensize;
	
	public PhoneBuilder setPrice(int price) {
		this.price = price;
		return this;
	}
	public PhoneBuilder setRAM(int rAM) {
		RAM = rAM;
		return this;
	}
	public PhoneBuilder setBattery(int battery) {
		this.battery = battery;
		return this;
	}
	public PhoneBuilder setScreensize(double screensize) {
		Screensize = screensize;
		return this;
	}
	public Phone build() {
		return new Phone(price,RAM,battery,Screensize);
	} 
}
