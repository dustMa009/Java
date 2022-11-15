package generics;

// if Animal is an interface, the key word is still extends not implement
public class AnimalPrinter <T extends Animal> {
	T thingToPrint;
	
	public AnimalPrinter(T thingToPrint) {
		this.thingToPrint = thingToPrint;
	}
	
	public void print() {
		// You can call method in Animal.
		thingToPrint.eat();
		System.out.println(thingToPrint);
	}
}
