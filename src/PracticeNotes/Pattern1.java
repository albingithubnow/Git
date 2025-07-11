package PracticeNotes;

public class Pattern1 {

	public static void main(String[] args) {

		int row = 3;
		int col = 3;
		
		for (int i = 1;i <=row; i++) {
			for (int s = 1;s<=col-1;s++) {
				System.out.print(" ");
			}
			for(int j = 1; j<=i;j++) {
				System.out.print('*');
			}
			System.out.println();
			
		}
		
	}

}
