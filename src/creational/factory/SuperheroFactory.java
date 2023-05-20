package creational.factory;

public class SuperheroFactory {
	public Superhero getSuperhero(String characteristic) {
		if(characteristic.equals("vigilante")) {
			return new Batman();
		}
		else if(characteristic.equals("Genius") || (characteristic.equals("Philanthropist"))){
			return new Ironman();
		}
		else if(characteristic.equals("fast")) {
			return new Flash();
		}
		else {
			return null;
		}
	}
}
