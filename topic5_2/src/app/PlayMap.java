package app;

import java.util.HashMap;
import java.util.Map;

public class PlayMap {

	public static void main(String[] args) {
		//Create a Map of Integers keyed by Integers
		Map<Integer, Integer> integerMap = new HashMap<Integer, Integer>();
		integerMap.put(1, 1);
		integerMap.put(2, 2);
		
		//Create a Map of Strings keyed by Integers
		Map<Integer, String> stringMap = new HashMap<Integer, String>();
		stringMap.put(1, "One");
		stringMap.put(2, "Two");
		
		//Create a Map of Strings keyed by Strings
		Map<String, String> nameMap = new HashMap<String, String>();
		nameMap.put("FirstName", "Lakeisha");
		nameMap.put("LastName", "McCree");
		
		//Print out size and if a Map is empty
		System.out.printf("Name Map Tests: size is %d and is empty %b\n", nameMap.size(), nameMap.isEmpty());
		
		//Use a For loop to loop over the keys to retrieve each Map value
		for (Map.Entry<String, String> m : nameMap.entrySet()) {
			System.out.printf("Key: %s Value: %s\n", m.getKey(), m.getValue());
		}
		
		integerMap.clear();
		stringMap.remove(1);
		stringMap.clear();
		nameMap.clear();

	}

}
