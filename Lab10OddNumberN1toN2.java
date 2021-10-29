package JavaLab;

import java.util.Scanner;

public class Lab10OddNumberN1toN2 {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1,n2,i;
        System.out.println("Enter n1:");
        n1 = sc.nextInt();

        System.out.println("Enter n2");
        n2 = sc.nextInt();

        System.out.println("Odd numbers from " + n1 + " to "+ n2);
        for(i=n1;i<=n2;i++)
        {
            if(i%2==1)
            {
                System.out.println(i);
            }
        }
	}
}
