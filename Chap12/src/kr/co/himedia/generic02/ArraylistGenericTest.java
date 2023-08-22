package kr.co.himedia.generic02;

import java.util.List;

public class ArraylistGenericTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Movie> list = new ArrayList<>;
		list.add(new Movie("미션임파서블","크리스토퍼","2023","미국"));
		list.add(new Movie("범죄도시","이상용","2023","한국"));
		
		System.out.println(list.get(0));
	}

}
