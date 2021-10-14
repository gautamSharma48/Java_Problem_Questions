package basic_problems;

public class reverseNumber {

	//time complexity-o(log(n))-n is input 
	//best 
	public int reverse(int num) {
		int rev=0;
		int prev_num=0;
		
		
	while(num!=0) {
		int current=num%10;
		rev=rev*10+current;
		
		if (num>Integer.MAX_VALUE || num<Integer.MIN_VALUE) 
			return 0;
			
		if ((rev-current)/10!=prev_num) 
			return 0;
			
		prev_num=rev;
		num=num/10;
	}
	return rev;
	}
	
	//time complexity-o(log(n))-for recursive way
	public void reverse2(int num) {
		
		
		if (num<10) {
			System.out.println(num);
			return ;
		}
		else {
			System.out.print(num%10);
			reverse2(num/10);
		}
		
	}
	
	//time complexity-o(log base10 (n))-for string way
	public long reverse3(int num) {
		StringBuffer sfBuffer=new StringBuffer(String.valueOf(num));
		
		sfBuffer.reverse();
		
		 num=Integer.parseInt(String.valueOf(sfBuffer));
		
		 return num;
	}
	
	
	
	
	
	public static void main(String[] args) {
		int num=1534236469;
		reverseNumber rvNumber=new reverseNumber();
		
		System.out.println(rvNumber.reverse(num));
		rvNumber.reverse2(num);
		
	}
}
