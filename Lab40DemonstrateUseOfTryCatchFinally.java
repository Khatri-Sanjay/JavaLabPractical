package JavaLab;

public class Lab40DemonstrateUseOfTryCatchFinally {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		int c = a + b;
		int d = a - b;
		try {
			System.out.println("Division:"+(a/b));
		}catch(Exception e) {
			System.out.println("Exception Occur");
		}
		int f = a*b;
		System.out.println("Addition:"+c);
		System.out.println("Substraction:"+d);
		System.out.println("Division:"+(a/b));
		System.out.println("Multiplication:"+f);
	}
}
