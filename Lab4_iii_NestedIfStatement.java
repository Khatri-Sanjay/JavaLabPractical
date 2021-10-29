package JavaLab;

public class Lab4_iii_NestedIfStatement {
	public static void main(String[] args) {
		int a=5,b=15,c=10;
		 if(a>b)
		 {
			 if(a>c)
			 {
				System.out.println("a is greatest");
			 }
			 else 
			 {
				 System.out.println("c is greatest");
			 }
		 }
		 else
		 {
			 if(b>c)
			 {
				 System.out.println("b is greatest");
			 }
			 else
			 {
				 System.out.println("c is greatest");
			 }
		 }
	}
}
