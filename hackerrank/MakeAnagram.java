package hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MakeAnagram {

	
    // Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {
    	HashMap<Character,Integer> mapA = new HashMap<Character,Integer>(); 
    	HashMap<Character,Integer> mapB = new HashMap<Character,Integer>(); 
    	Set<Character> checkedSet = new HashSet<Character>();
    	int count = 0;
    	
    	for (char ch: a.toCharArray()) 	{
    		if (!mapA.containsKey(ch))
    			mapA.put(ch, 1);
    		else
    			mapA.put(ch, mapA.get(ch)+1);
    	}

    	for (char ch: b.toCharArray()) 	{
    		if (!mapB.containsKey(ch))
    			mapB.put(ch, 1);
    		else
    			mapB.put(ch, mapB.get(ch)+1);
    	}
    	
    	for (char ch: mapA.keySet()) {
    		if (!checkedSet.contains(ch)) {
    			checkedSet.add(ch);
    			if(!mapB.containsKey(ch))
    				count += mapA.get(ch);
    			else {
    				count += Math.abs(mapA.get(ch)-mapB.get(ch));
    				mapB.remove(ch);
    			}
    				
    		}
    	}
    	
    	for (char ch: mapB.keySet()) {
    		count += mapB.get(ch);
    	}
    	return count;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(makeAnagram("cde", "abc"));
	}

}
