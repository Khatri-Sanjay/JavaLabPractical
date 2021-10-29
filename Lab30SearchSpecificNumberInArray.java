package JavaLab;

import java.util.Scanner;

public class Lab30SearchSpecificNumberInArray {
		public static void main(String[] args){
			int count=0, n;
			Scanner s = new Scanner(System.in);
			System.out.print("Enter a number to search: ");
			n = s.nextInt();
			int arr[] = {1,1,2,2,3,3,3,4,4,4,4,5,5,5,5,5};
			for(int i = 0; i < arr.length; i++){
				if(n == arr[i])
				count++;
			}
			if(count!=0)
				System.out.println(n + " is in array and repeated " + count + " times.");
			else
				System.out.println(n + " is not in array.");
	}
}

