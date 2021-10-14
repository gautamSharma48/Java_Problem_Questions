package hackerearth;


import java.util.Scanner;

public class divisibility {
	
	public static void main(String[] args) {
		int[] arr=new int[] {10,15,5};
		
		int n=arr.length;
		
		int lastdigit=arr[n-1]%10;
		
		if (lastdigit==0) {
			System.out.println("yes");
		}else {
			System.out.println("No");
		}
		
		
	}

}
