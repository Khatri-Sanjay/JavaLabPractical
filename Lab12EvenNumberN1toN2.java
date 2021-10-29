package JavaLab;

import java.util.Scanner;

public class Lab12EvenNumberN1toN2 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int n1 = s.nextInt();
		System.out.print("Enter second number: ");
		int n2 = s.nextInt();
		for(int i=n1;i<=n2;i++)
		{
			if(i%2==0)
				System.out.print(i + "\n");
		}
		}
}
