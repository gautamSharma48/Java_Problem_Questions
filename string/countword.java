package string;



public class countword {
	
	//using split method
	public int countsword(String str) {
		
		if (str==null ||str.isEmpty()) {
			return 0;
		}
		String word[]=str.split("\\s+");
	/*   
		 \\s= matches single whitespace character
        \\s+=  matches sequence of one or more whitespace characters. 
    */
		 
		
		return word.length;
		//time complexity-O(N)
		
		
	}
	
	public int countsword2(String str) {
		int out=0;
		int state=out;
		int in=1;
		int i=0;
		int wc=0;
		
		while(i<str.length()) {
			
			if (str.charAt(i)==' ' || str.charAt(i)=='\n' || str.charAt(i)=='\t') {
				state=out;
			}
			else if(state==out) {
				state=in;
				
				System.out.println(++wc);
				
			}
			++i;
		}
		return wc;
		
		//time complexity-O(N)
	}
	
	public static void main(String[] args) {
		String string="my name is a \ngautam \tsharma ";
		countword s=new countword();
		System.out.println("No.of words"+s.countsword(string));
		System.out.println("No.of words"+s.countsword2(string));
		
	}
	
}