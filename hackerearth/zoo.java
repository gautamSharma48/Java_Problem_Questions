package hackerearth;


import java.util.Scanner;

public class zoo {
	
	public static void main(String[] args) {
	String string;
	Scanner s=new Scanner(System.in);
	System.out.println("enter input");
	string=s.nextLine();
	int zcount=0,ocount=0;
	
	for(int i=0;i<string.length();i++) {
		
		if (string.charAt(i)=='z' || string.charAt(i)=='Z') {
			zcount++;
			
		}
		else if (string.charAt(i)=='o' || string.charAt(i)=='O') {
			ocount++;
		}
	}
	
	if (zcount*2==ocount) {
		System.out.println("Yes"+string.length());
	}
	else
		System.out.println("No");
		
	}

}
