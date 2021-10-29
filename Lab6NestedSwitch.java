package JavaLab;

import java.util.Scanner;

public class Lab6NestedSwitch {
	public static void main(String[] args){
		 
		//input
		Scanner s = new Scanner(System.in);
		System.out.println("1. Separate Information\n2. Combined Information");
		System.out.println("\nEnter a position to display information(1/2): ");
		int val1 = s.nextInt();
		switch(val1)
		//switched option 1.
		{
			case 1:
				System.out.println("1. Name\n2. Phone No.");
				System.out.println("Enter your choice(1/2)");
			int val2 = s.nextInt();
			switch(val2)
			{
				case 1:
					System.out.println("Name : Sanjay khatri");
				break;
				case 2:
					System.out.println("Phone No. : 9861494803");
				break;
				default:
					System.out.println("Invalid input");
				}
				break;
				case 2:
					System.out.println("Name: Sanjay khatri \n Phone Number : 9861494803");
				break;
				default:
					System.out.println("Invalid input");
				}
		}
}
