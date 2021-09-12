package com.xworkz.arrayExamples;

public class SumOfArrayElements {

	public static void main(String[] args) {
		int numbers[] = { 112, 114, 117, 123, 125, 128 };
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum = sum + numbers[i];
		}
		System.out.println(sum);
	}

}
