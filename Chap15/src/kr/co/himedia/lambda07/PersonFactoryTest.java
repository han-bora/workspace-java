package kr.co.himedia.lambda07;

public class PersonFactoryTest {

	public static void main(String[] args) {

		PersonFactory personFactory = Person::new;
		Person person = personFactory.create("이순신", 40);
		System.out.println(person);

		PersonFactory personFactory2 = new PersonFactory() {

			@Override
			public Person create(String name, int age) {
				return new Person(name, age);
			}
		};
		
		PersonFactory personFactory3 = (name, age) -> new Person(name, age);
		Person person3 = personFactory3.create("이도", 23);
		System.out.println(person3);

	}
}
