package PracticeNotes;

public class Pattern {

	public static void main(String[] args) {
		for (int i = 0; i  <=5; i++) {
			for (int j=1; j<=i;j++) {
				System.out.print("*");
			}System.out.println();
		}
		
		for (int x = 1; x<=5; x++) {
			for (int y = 1; y <= x; y++) {
				if(y<=x) {
					System.out.print("*");
				}
			}System.out.println();
		}
	}
}
