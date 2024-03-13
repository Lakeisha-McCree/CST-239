package app;

public class MyArray {

	public <E> void printArray(E[] inputArray) {
		//Iterate over each element and print each element
		for(E element : inputArray) {
			System.out.printf("%s ", element);
		}
	}
	
	
	public static void main(String[] args) {
		//Create arrays of Integer, Double, and Character
		Integer [] intArray = {1, 2, 3, 4, 5};
		Double [] doubleArray = {1.1, 2.2, 3.3, 4.4};
		Character [] characterArray = {'H', 'E', 'L', 'L', 'O'};
		
		//Print each array out
		MyArray ma = new MyArray();
		System.out.println("Array integerArray contains:");
		ma.printArray(intArray); //pass an integer array
		System.out.println("\nArray doubleArray contains:");
		ma.printArray(doubleArray); //pass a double array
		System.out.println("\nArray characterArray contains:");
		ma.printArray(characterArray); //pass a character array
		
	}
}


