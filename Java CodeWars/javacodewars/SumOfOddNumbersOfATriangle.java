package javacodewars;

public class SumOfOddNumbersOfATriangle {
	public static void main(String[] args) {
		System.out.println(rowOfOddNumbers(43));
	}
	
	public static int rowOfOddNumbers(int n) {
		//the sum of the n^th line of odd numbers is n^3
		return n * n * n;
	}
}
