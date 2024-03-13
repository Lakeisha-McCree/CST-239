package app;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class PlayQueue {
	/**
	 * offer() - inserts an element into the head of the Queue
	 * add() - inserts and element into the head of the Queue
	 * peek() - retrieves but does not remove from the head element of the Queue
	 * remove() - retrieves and removes an element from the head of the Queue
	 * size() - returns the number of elements in the Queue
	 */
	

	public static void main(String[] args) {
		//Set up a Queue of Strings
		Queue<String> stringQueue = new LinkedList<String>();
		stringQueue.offer("Lakeisha McCree");
		stringQueue.add("Blair Imani");
		stringQueue.offer("Andrew Joshua");
		stringQueue.add("Ivy Monroe");
		
		//Setup a Queue of Integers
		Queue<Integer> integerQueue = new LinkedList<Integer>();
		integerQueue.add(1);
		integerQueue.offer(-1);
		integerQueue.add(5);
		integerQueue.offer(10);
		
		//Print out size and head element of the Queue
		System.out.println(integerQueue);
		System.out.printf("Integer Queue Tests: size is %d and head element is %d\n",
				integerQueue.size(), integerQueue.peek());
		
		//Use Iterator to get elements from the Queue, could of used loop over size() and used remove() to achieve the same functionality
		Iterator<String> itr = stringQueue.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
