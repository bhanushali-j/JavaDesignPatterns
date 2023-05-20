package creational.factory;

public class SuperheroFactoryMain {
	public static void main(String args[]) {
		SuperheroFactory superheroFactory=new SuperheroFactory();
		
		Superhero superhero=superheroFactory.getSuperhero("vigilante");
		
		superhero.power();
	}
}
