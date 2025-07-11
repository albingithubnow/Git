package PracticeNotes;

public class DigitsInNum {
public static void main(String[] args) {
	int a = 25;
	int b = 23;
	int c = 10;
	
	int max = (a > b) ? ((a>c )? a : c) :((b>c) ? b : c );
	System.out.println("the greater digit is "+ max);
}
}
