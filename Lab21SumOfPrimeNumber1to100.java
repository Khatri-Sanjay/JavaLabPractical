package JavaLab;

public class Lab21SumOfPrimeNumber1to100 {
	public static void main(String[] args){
		int number,sum=0;
		for(number=1; number<=100; number++)
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
				sum+=number;
		}
			System.out.print("Sum of prime number from 1 to 100 is " + sum);
	}
}
