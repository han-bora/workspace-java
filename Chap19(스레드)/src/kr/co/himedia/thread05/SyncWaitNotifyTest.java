package kr.co.himedia.thread05;

import java.util.ArrayList;

class HimediaBooks {
	public ArrayList<String> shelf = new ArrayList<>();
	
	public HimediaBooks() {
		shelf.add("알코의 TOO MUCH 친절한 깃&깃허브");
		shelf.add("알코의 TOO MUCH 친절한 깃&깃허브");
		shelf.add("알코의 TOO MUCH 친절한 깃&깃허브");
		shelf.add("알코의 TOO MUCH 친절한 깃&깃허브");
		shelf.add("알코의 TOO MUCH 친절한 깃&깃허브");
	}
	
	public String lendBook() {
		String book = shelf.remove(0);
		System.out.println(Thread.currentThread().getName() + " : " + book + "빌림");
		return book;
	}
	
	public void returnbook(String book) {
		shelf.add(book);
		System.out.println(Thread.currentThread().getName() + " : " + book + "반납함");
		
		
	}
	
	
}

class Person extends Thread {
	
	public Person(String name) {
		super(name);
		
	}
	@Override
	public void run() {
		String title = SyncWaitNotifyTest.hibooks.lendBook();
		
		if(title == null) return;
		try { Thread.sleep(5000);
		SyncWaitNotifyTest.hibooks.returnbook(title);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
public class SyncWaitNotifyTest {
	
	
	public static HimediaBooks hibooks = new HimediaBooks();
	
	public static void main(String[] args) {
		
		Person person1 = new Person("person1");
		Person person2 = new Person("person2");
		Person person3 = new Person("person3");
		Person person4 = new Person("person4");
		Person person5 = new Person("person5");
		
		
		person1.start();
		person2.start();
		person3.start();
		person4.start();
		person5.start();
		
	}
	

}
