package Practice1;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = {5,1,4,3,9,6,2,8};
		int n = arr.length;
		
		for(int i= 0; i<n-1; i++) {
			for (int j=0; j<n-1-i; j++) {
				if(arr[i] > arr[j+1]) {
					
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
					
			}
		}
		System.out.println("Sorted array : ");
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]+ "");
		}
	}
}
