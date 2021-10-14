package Array;

import java.util.Iterator;

/* array:-
insertion,deletion,search*/

/* sorted array can be
  -ascending order
  -descending order */

public class SortedArray {
	   
	public int[] sortedarrayAscendingorder(int[] nums1){
	        
	        int i=0,j=0,temp=0;
	        int n=nums1.length;
	        for(i=0;i<n;i++){
	            for(j=i+1;j<n;j++){
	                if(nums1[i]>nums1[j]){
	                    temp=nums1[i];
	                    nums1[i]=nums1[j];
	                    nums1[j]=temp;
	                }
	                
	            }
	            System.out.print(nums1[i]+" ");
	        }
	        System.out.println("");
	        return nums1;
	        
	    }
	public int[] sortedarraydescendingorder(int[] nums1){
        
        int i=0,j=0,temp=0;
        int n=nums1.length;
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(nums1[i]<nums1[j]){
                    temp=nums1[i];
                    nums1[i]=nums1[j];
                    nums1[j]=temp;
                }
                
            }
            System.out.print(nums1[i]+" ");
        }
        
        return nums1;
        
    }
	
	//MERGE TWO SORTED ARRAY
	public int[] mergeArray(int arr1[],int arr2[],int arr3[],int n1,int n2) {
		/*merging two sorted array can be done using three method:-
		1.time complexity-o(n*m) and space-o(1)
		
		2.time complexity-o(n+m) and o(n1+n2) for extra space
		
		3.o(n*logn+m*logm) space-o(N)
		
		*/
		
		//method-2:-
		int i=0,j=0,k=0;
		
		//first while loop is completed excuted on both array when both array length is equal 
		while(i<n1 && j<n2) {
			//if current element of first array is smaller than current element of second array
			if(arr1[i]<arr2[j]) {
				arr3[k++]=arr1[i++];
			}else {
				arr3[k++]=arr2[j++];
			}
		}
			//store  remaining element first array
			while(i<n1) {
				arr3[k++]=arr1[i++];
			}
			//store remaining element second array
			while(j<n2) {
				arr3[k++]=arr2[j++];
			}
			for(int p=0;p<n1+n2;p++) {
				System.out.print(" \n"+arr3[p]);
			}
		
		
		return arr3;
	}
	
	    
	    public static void main(String args[]){
	        int[] arr1 = new int[]{
	            45,50,50,25,50,75,100
	        };
	        int[] arr2=new int[]{
	            25,250,65,15,16
	        };
	        SortedArray sa=new SortedArray();	
	       int r[]= sa.sortedarrayAscendingorder(arr1);
	        int q[]=sa.sortedarrayAscendingorder(arr2);
	        //sa.sortedarraydescendingorder(arr1);
	        
	        int n1=r.length;
	        int n2=q.length;
	        int[] arr3 = new int[n1 + n2];
	       int[] result= sa.mergeArray(r, q, arr3, n1, n2);
	       
			
	    }
}
