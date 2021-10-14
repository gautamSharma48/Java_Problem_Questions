package hackerearth;

import java.util.Scanner;

public class UpperLowerCase_Problem {
	
	public static void main(String[] args) {
        int ts;
        
        Scanner sc=new Scanner(System.in);
        ts=sc.nextInt();
        sc.nextLine();
        String[] str=new String[ts];
        
        for(int i=0;i<str.length;i++) {
        	str[i]=sc.nextLine();
        }
       
        for(int i=0;i<str.length;i++){
        	
        	int uppercount=0,lowercount=0;
        	String tempString=str[i];
        	
        	for(int j=0;j<tempString.length();j++) {
            
        		if(Character.isUpperCase(tempString.charAt(j)))
                uppercount++;
            else if(Character.isLowerCase(tempString.charAt(j)))
                lowercount++;
               
            
            
        }
        	 if(uppercount>lowercount)
                 System.out.println(tempString.toUpperCase());  
               
               else if(lowercount > uppercount)
               System.out.println(tempString.toLowerCase());    
               
               else if(lowercount==uppercount)
                   System.out.println(tempString.toLowerCase()); 
       }
      
    }
   
}