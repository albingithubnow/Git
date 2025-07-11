package Java;

public class LinearSearch {
public static void main(String[] args) {
	int[]arr = {8,6,4,9,2,3};
	int key=2;
	for(int i=0;i<arr.length;i++) {
		if (arr[i]==key) {
			System.out.println("found at " +i+ " index position");
			return;
		}
	}
	System.out.println("not found");
}
}
