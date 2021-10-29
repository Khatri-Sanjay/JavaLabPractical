package JavaLab;

import java.util.Scanner;

public class Lab33ClassToAcceptAndPrintPersonalInfo {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		String name, address,email;
		Long phoneNo;
		System.out.println("Enter your Details");
		System.out.print("Enter name:");
		name = s.nextLine();

		System.out.print("Enter address: ");
		address = s.nextLine();

		System.out.print("Enter email: ");
		email = s.nextLine();

		System.out.print("Enter phone number: ");
		phoneNo = s.nextLong();

		System.out.println("\n\nYour Personal Details");
		System.out.println("Name: " + name);
		System.out.println("Address: " + address);
		System.out.println("Phone Number: " + phoneNo);
		System.out.println("Email: " + email);
		}
}
