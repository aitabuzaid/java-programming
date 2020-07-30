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
    	for (char ch: a.toCharArray()) 	{
    		if (!mapA.containsKey(ch))
    			mapA.put(ch, 1);
    		else
    			mapA.put(ch, mapA.get(ch)+1);
    	}
    	
    	HashMap<Character,Integer> mapB = new HashMap<Character,Integer>(); 
    	for (char ch: b.toCharArray()) 	{
    		if (!mapB.containsKey(ch))
    			mapB.put(ch, 1);
    		else
    			mapB.put(ch, mapB.get(ch)+1);
    	}

    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
