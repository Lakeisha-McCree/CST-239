package app;

public class MyNumbersArray {
	public <E> void printArray(E[] inputArray) {
		//Iterate over each element and print each element
		for(E element : inputArray) {
			System.out.printf("%s ", element);
		}
	}
	
	
	public static void main(String[] args) {
		//Create arrays of Integer, Double, and Character
		Integer[] intArray = {1, 2, 3, 4, 5};
		Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
		Float[] floatArray = {0.0f, 1.0f, 2.5f, 3.5f};
		
		//Print each array out
		MyNumbersArray ma = new MyNumbersArray();
		System.out.println("Array integerArray contains:");
		ma.printArray(intArray); //pass an Integer array
		System.out.println("\nArray doubleArray contains:");
		ma.printArray(doubleArray); //pass a Double array
		System.out.println("\nArray characterArray contains:");
		ma.printArray(floatArray); //pass a Float array
		
	}
}
