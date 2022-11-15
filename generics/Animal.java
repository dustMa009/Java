package generics;

public class Animal {
	private String name;
	
	public Animal() {};
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void eat() {
		System.out.println("Munch munch munch.");
	}
}
