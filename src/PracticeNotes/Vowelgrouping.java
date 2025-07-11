
package PracticeNotes;

import java.util.Scanner;

public class Vowelgrouping {

	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		
		System.out.println("enter the character");
		
		char c = (s.next().charAt(0));
		switch (c>='A' && c<='Z'?(char) (c+32) : c)
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u': System.out.println("vowel");
		break;
		default : System.out.println("consonant");
			
		
		}
	}
}
