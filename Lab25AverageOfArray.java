package JavaLab;

import java.util.Scanner;

public class Lab25AverageOfArray {
public static void main(String[] args){
		
		System.out.println("How many number do you want to enter:");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[]arr = new int[n];
		int total = 0;
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter element no."+(i+1)+":");
			arr[i] = s.nextInt();
		}
		s.close();

		for(int i=0;i<arr.length;i++) {
			total = total + arr[i];
		}
		float average = total/arr.length;
		System.out.println("Average of the given array is "+average);
	}

}
