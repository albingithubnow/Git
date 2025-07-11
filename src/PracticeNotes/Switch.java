package PracticeNotes;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		
		Scanner s  = new Scanner(System.in);
		
		System.out.println("enter the character");
		int a = s.nextInt();
		
		switch (a) {
			case 1: System.out.println("ok");
			break;
			case 2: System.out.println("byee");
			break;
			case 3: System.out.println("Welcome");
			break;
			case 4: System.out.println("hello");
			break;
			}
			s.close();
					
	}
}
