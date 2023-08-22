package kr.co.himedia.set04;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Integer> scoreMap = new HashMap<>();
		
		scoreMap.put("이순신", 98);
		scoreMap.put("신사임당", 100);
		scoreMap.put("이방원", 80);
		
		System.out.println("이순신의 점수는 " + scoreMap.get("이순신"));
		
		scoreMap.put("신사임당", 100);
		System.out.println("신사임당의 점수 : " + scoreMap.get("신사임당"));
		
		scoreMap.remove("이방원");
		System.out.println("이방인의 점수 : " + scoreMap.get("이방원"));
		
		for(Map.Entry<String, Integer> entry : scoreMap.entrySet()) {
			System.out.println(entry.getKey() + "의 점수는" + entry.getValue());
		}

	}

}
