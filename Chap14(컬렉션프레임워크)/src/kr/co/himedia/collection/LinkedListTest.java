package kr.co.himedia.collection;

import java.util.LinkedList;

public class LinkedListTest {
	
	public static void main(String[] args) {
		
		LinkedList<String> myList = new LinkedList <String>();
		myList.add("A");
		myList.add("B");
		myList.add("C");
		
		System.out.println(myList);
		
		myList.add(1, "0");
		System.out.println();
		
		myList.remove();
		System.out.println();
	}

}
