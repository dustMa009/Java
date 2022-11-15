package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample {
	public static void main(String[] args) {
		Printer<Integer> printer = new Printer<>(23);
		printer.print();
		
		Printer<Double> doublePrinter = new Printer<>(33.5);
		doublePrinter.print();
		
		ArrayList<Integer> nums = new ArrayList<>();
		
		// call on the generics method
		shout("John", 74);
		
		// call on the wildcard method.
		List<Integer> intList = new ArrayList<>();
		intList.add(3);
		intList.add(5);
		printList(intList);
	}
	
	// generics in methods
	private static <T, V> void shout(T thingToShout, V otherThingToShout) {
		System.out.println(thingToShout + "!!!!!");
		System.out.println(otherThingToShout + "!!!!");
	}
	
	// generics can also be used as wildcard.
	private static void printList(List<?> myList) {
		for (var c : myList) {
			System.out.println(c);
		}
	}
}
