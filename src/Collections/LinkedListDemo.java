package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arraylist = new ArrayList<String>();
		arraylist.add("Item1");
		arraylist.add("Item5");
		arraylist.add("Item3");
		arraylist.add("Item6");
		arraylist.add("Item2");

		System.out.println("List elements: " + arraylist);
		LinkedList<String> linkedlist = new LinkedList<String>();
		linkedlist.add("Item1");
		linkedlist.add("Item5");
		linkedlist.add("Item3");
		linkedlist.add("Item6");
		linkedlist.add("Item2");
		System.out.println("LinkedList elements: " + linkedlist);

		linkedlist.addFirst("First element");
		linkedlist.addLast("Last element");

		System.out.println("After adding First and Last elements: " + linkedlist);

		linkedlist.removeFirst();
		linkedlist.removeLast();
		System.out.println("After removing first and Last elements: " + linkedlist);

		linkedlist.add(0, "New element added");
		linkedlist.remove(2);
		System.out.println("Final Content: " + linkedlist);

		Iterator it = linkedlist.iterator();

		while (it.hasNext()) {

			System.out.println(it.next());
		}
	}

}
