package string;

import java.util.*;

public class duplicateString {
	
	
//best way to count duplicate word in java
	
	public void duplicatewordcount(String inputString) {
		Map<String , Integer> wordcount=new HashMap<String,Integer>();
		
		String words[]= inputString.split("\\s+");
		//to check word a given array
		
		for (int i=0;i<words.length;i++) {
			if (wordcount.containsKey(words[i])) {
				wordcount.put(words[i], wordcount.get(words[i])+1);
			}
			else {
				wordcount.put(words[i], 1);
			}
		}
		//extracting keys of the map
		Set<String> wordsinStrings=wordcount.keySet();
		System.out.println(wordsinStrings);
		
		for (String word:wordsinStrings){
			
			if (wordcount.get(word)>1 )
				System.out.println(word+""+wordcount.get(word));	
		}
	}
	
public static void main(String[] args) {
	
	String string="this is my room and room is also mine room";
	duplicateString dString=new duplicateString();
	dString.duplicatewordcount(string);
	

	
}
}
