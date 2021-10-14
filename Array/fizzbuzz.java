package Array;

import java.util.*;

class fizzbuzz {
    public List<String> fizzBuzz(int n) {
        List<String> list=new ArrayList<>();
        
        for(int i=1;i<=n;i++){
            
            if(i%3 == 0 && i%5 == 0){
                list.add("FizzBuzz");
                
            }
            else if(i%3==0){
            
                list.add("Fizz");
  
            }
            else if(i%5==0){
                list.add("Buzz");
            }
            else{
                list.add(String.valueOf(i));
            }
            
            
        }
        
        return list;
        
        
        
    }
    public static void main(String args[]){
        int n;
        fizzbuzz s=new fizzbuzz() ;
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        List<String> list1=new ArrayList<>();
       list1= s.fizzBuzz(n);
       
             System.out.println(list1);
        
       
    }
}