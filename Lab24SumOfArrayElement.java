package JavaLab;

import java.util.Scanner;

public class Lab24SumOfArrayElement {
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		int[]num;
		num = new int[10];
		int i, sum = 0;
		System.out.println("Enter 10 number:");
		for(i=0;i<10;i++) {
			num[i] = s.nextInt();
		}
		System.out.println("Array elements are:");
		for(i=0;i<10;i++) {
			System.out.println(num[i]+"\t");
			sum = sum + num[i];
		}
		System.out.println("Sum of the given array is "+sum);
	}
}
