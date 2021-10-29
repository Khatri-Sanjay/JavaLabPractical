package JavaLab;

import java.util.Scanner;

public class Lab14PrimeNumberN1toN2 {
	public static void main(String[] args){
		int number;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int n1 = s.nextInt();
		
		System.out.print("Enter second number: ");
		int n2 = s.nextInt();
		
		for(number=n1; number<=n2; number++)
		{
			int count=0;
			for(int i=2; i<=number/2; i++)
			{
				if(number%i==0)
				{
					count++;
					break;
				}
			}
				if(count == 0 && number != 1)
				System.out.print(number + "\t");
		}
	}
}
