package kr.co.himedia.generic03;

import java.util.HashMap;
import java.util.Map;

public class PairGenericTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pair<String, Integer> pair = new Pair<>("Himedia", 2023);
		System.out.println(pair.getKey());
		System.out.println(pair.getValue());
		
		
		Map<String, Integer> maps = new HashMap<>();
		maps.put("kor", 90);
		maps.put("eng", 90);
		maps.put("math", 100);
		
		System.out.println(maps.get("kor"));
		System.out.println(maps.get("eng"));
		System.out.println(maps.get("math"));

	}

}
