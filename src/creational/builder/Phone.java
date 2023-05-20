package creational.builder;

public class Phone {
	private  int price;
	private  int RAM;
	private  int battery;
	private double Screensize;
	public Phone(int price, int rAM, int battery, double screensize) {
		super();
		this.price = price;
		RAM = rAM;
		this.battery = battery;
		Screensize = screensize;
	}
	@Override
	public String toString() {
		return "Phone [price=" + price + ", RAM=" + RAM + ", battery=" + battery + ", Screensize=" + Screensize + "]";
	}
	
	
}
