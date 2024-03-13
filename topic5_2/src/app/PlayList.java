package app;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PlayList {

	public static void main(String[] args) {
		//Create a list of Integers and add elements using add()
		List<Integer> integerList = new ArrayList<Integer>();
		integerList.add(Integer.valueOf(10));
		integerList.add(Integer.valueOf(11));
		
		//Create a list of Strings and add elements using add()
		List<String> stringList = new ArrayList<String>();
		stringList.add("Hello World");
		stringList.add("Hi World");
		
		//Get the first element from the list using get()
		System.out.printf("Integer Value :%d\n", integerList.get(0));
		System.out.printf("String Value :%s\n", stringList.get(0));
		
		//Loop over the List using a for loop
		for (Integer data : integerList) {
			System.out.printf("Integer Value :%d\n", data);
		}
		
		//Loop over the List using an Iterator
		Iterator<String> stringIterator = stringList.iterator();
		while (stringIterator.hasNext()) {
			System.out.printf("String Value :%s\n", stringIterator.next());
		}
	}

}
