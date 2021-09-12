package com.xworkz.arrayExamples;

public class SumOfOddNumbers {

	public static void main(String[] args) {
		int numbers[] = { 112, 114, 117, 123, 125, 128 };
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 != 0) {
				sum = sum + numbers[i];
			}
		}
		System.out.println(sum);
	}

}
