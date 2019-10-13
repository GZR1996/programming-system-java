package class6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Exercise6 {
	//	Java exercises
	//	Please see the separate sheet about running Eclipse if you are not familiar with the Eclipse IDE.
	
	//	Task 1
	//	Write a Java method to compute and print the list of prime numbers less than a given parameter.
	//	The method signature should be as follows:
	//	void printPrimes (int max)
	private boolean isPrime(int num) {
		boolean isPrime = true;
		for (int divisor = 2; divisor < num; divisor++) {
			if (num % divisor == 0) {
				isPrime = false;
				break;
			}
		}
		
		if (isPrime) {
			return true;
		} else {
			return false;
		}
	}
	
	private ArrayList<Integer> getPrimes(int max) {
		ArrayList<Integer> res = new ArrayList<Integer>();
		
		for (int num = 2; num <= max; num++) {
			if (isPrime(num)) {
				res.add(num);
			}
		}
		
		return res;
	}
	
	public void printPrimes(int max) {
		System.out.println(getPrimes(100));
	}
	
	//	Task 2
	//	Write a Java method to compute and return the Nth Fibonacci number, which is a sequence of
	//	numbers where each number is the sum of the preceding two (see
	//	https://en.wikipedia.org/wiki/Fibonacci_number if you can’t remember the details). The method
	//	signature should be as follows:
	//	int computeFibonacci (int n)
	public int computeFibonacci(int n) {
		if (n == 1 || n == 2) {
			return 1;
		} else {
			return computeFibonacci(n-1) + computeFibonacci(n-2);
		}
	}
	
	//	Task 3
	//	Implement a method computeScore that correctly computes and returns the score that you
	//	would receive in the game of Scrabble1 for the string given as a parameter – that is, you must add up
	//	the score of each letter in the string and return the total value. Refer to the following table of values
	//	for each letter:
	//	A: 1 B: 3 C: 3 D: 2 E: 1
	//	F: 4 G: 2 H: 4 I: 1 J: 8
	//	K: 5 L: 1 M: 3 N: 1 O: 1
	//	P: 3 Q: 10 R: 1 S: 1 T: 1
	//	U: 1 V: 4 W: 4 X: 8 Y: 4
	//	Z: 10
	//	If you encounter any characters other than those 26 letters, then they should not affect the total
	//	score, but you should be sure to consider both upper case and lower case letters.
	//	The signature for the method must be as follows:
	//	int computeScore (String word)
	//	1 https://en.wikipedia.org/wiki/Scrabble or http://www.scrabble.com/
	private static HashMap<String, Integer> map = new HashMap<String, Integer>();
	private static final String CONTEXT_STRING = "A: 1 B: 3 C: 3 D: 2 E: 1 " + 
			"F: 4 G: 2 H: 4 I: 1 J: 8 " + 
			"K: 5 L: 1 M: 3 N: 1 O: 1 " + 
			"P: 3 Q: 10 R: 1 S: 1 T: 1 " + 
			"U: 1 V: 4 W: 4 X: 8 Y: 4 " + 
			"Z: 10";
	
	private void init() {
		String[] scores = CONTEXT_STRING.replace(":", "").split(" ");
		for (int i = 0; i < scores.length; i += 2) {
			map.put(scores[i], Integer.parseInt(scores[i+1]));
		}
	}
	
	private int computeScore (String word) {
		int score = 0;
		word = word.toUpperCase();
		for (int i = 0; i < word.length(); i++) {
			score += map.get(""+word.charAt(i));
		}
		return score;
	}
	
	//	Task 4, Task 5, Task 6
	// see in the Monster.class

	public static void main(String[] args) {
		Exercise6 exercise = new Exercise6();
		// Task 1
		exercise.printPrimes(100);
		// Task 2
		System.out.println(exercise.computeFibonacci(4));
		// Task 3
		exercise.init();
		System.out.println(exercise.computeScore("abc"));
		// Task 4
		long y = (byte)100;
		// Task 5
		 int arr[] = new int[2];  
	     System.out.println(arr[0]);
	     System.out.println(arr[1]);
		// Task 6
		
	}
}
