package kr.co.himedia.collection;

import java.util.ArrayList;

public class ListLab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list = new ArrayList<>();
		list.add("apple");
		list.add("banana");
		list.add("cherry");
		list.add("banana");
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		
		list.remove(0);
		list.set(1, "orange");
		
		System.out.println();
		
		for(String str : list)
			System.out.println(str);

	}

}
