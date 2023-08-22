package kr.co.himedia.list;

import java.util.ArrayList;

public class MemberArrayList {
	
	private ArrayList<Member> ArrayList;
	
	public MemberArrayList() {
		ArrayList = new ArrayList<>();
	}
	
	public void addMember(Member member) {
		ArrayList.add(member);
		
	}
	
	
	public void showAllMembers() {
		for(Member memeber : ArrayList)
			System.out.println(memeber);
	}

}
