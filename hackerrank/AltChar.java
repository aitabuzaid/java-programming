package hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class AltChar {

    // Complete the alternatingCharacters function below.
    static int alternatingCharacters(String s) {
    	Stack<Character> stack = new Stack<Character>();
    	int count = 0;
    	stack.add(s.charAt(0));
    	for (int i = 1; i < s.length(); i++) {
    		if (stack.peek().charValue() != s.charAt(i))
    			stack.add(s.charAt(i));
    		else
    			count++;
    	}
    	return count;
    }

    public static void main(String[] args) {
    	System.out.println(alternatingCharacters("AABBAA"));
    }
}
