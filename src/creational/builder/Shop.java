package creational.builder;


//Before creating PhoneBuilder class we would have had to give every property of Phone in the order of its constructor

public class Shop {
	public static void main(String args[]) {
		
		Phone phone=new PhoneBuilder().setRAM(8).setPrice(15000).build();
		System.out.println(phone.toString());
	}
}
