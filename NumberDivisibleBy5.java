package com.xworkz.arrayExamples;

public class NumberDivisibleBy5 {

	public static void main(String[] args) {
		int numbers[] = { 112, 114, 117, 123, 125, 128 };
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 5 == 0) {
				System.out.println(numbers[i]);
			}
		}
	}

}