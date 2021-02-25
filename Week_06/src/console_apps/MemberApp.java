package console_apps;

import model.Member;

public class MemberApp {

	public static void main(String[] args) {
		System.out.println("Before creating two members....");
		Member member1 = new Member(); // default constructor
		System.out.println("After creating member 1...");
		Member member2 = new Member();
		System.out.println("After creating member 2...");
	}

}
