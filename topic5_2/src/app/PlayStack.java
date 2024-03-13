package app;

import java.util.Iterator;
import java.util.Stack;

public class PlayStack {

	/**
	 * push() - inserts an element into the top from the stack
	 * peek() - retrieves but does not remove the top element from the Stack
	 * pop() - retrieves and removes the top element from the Stack
	 * size() - returns the number of elements in the Stack
	 */
	
	public static void main(String[] args) {
		//Set up a Stack of Strings
		Stack<String> stringStack = new Stack<String>();
		stringStack.push("Lakeisha McCfee");
		stringStack.push("Blair Imani");
		stringStack.push("Andrew Joshua");
		stringStack.push("Ivy Monroe");
		
		//Set up a Stack of Integers
		Stack<Integer> integerStack = new Stack<Integer>();
		integerStack.push(1);
		integerStack.push(-1);
		integerStack.push(5);
		integerStack.push(10);
		
		//Print out size and second element in the Stack
		System.out.println(integerStack);
		System.out.printf("Integer Stack Tests: size is %d and 2nd element is %d\n",
				integerStack.size(), integerStack.elementAt(1));
		
		//Use Iterator to get elements from the stack, could of used loop over size() and used pop() to achieve the same functionality
		Iterator<String> itr = stringStack.iterator();
		while(itr.hasNext() ) {
			System.out.println(stringStack.pop());
		}
;	}

}
