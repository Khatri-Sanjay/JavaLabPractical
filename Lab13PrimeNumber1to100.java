package JavaLab;

public class Lab13PrimeNumber1to100 {
	public static void main(String[] args){
		int i,n;
		for(i=1; i<=100; i++)
		{
		int count=0;
		for(n=2; i<=i/2; n++)
		{
		if(i%n==0)
		{
		count++;
		break;
		}
		}
		if(count == 0 && i != 1)
		System.out.print(i + "\n");
		}
		}
}
