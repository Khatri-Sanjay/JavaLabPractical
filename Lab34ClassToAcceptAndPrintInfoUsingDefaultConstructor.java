package JavaLab;

public class Lab34ClassToAcceptAndPrintInfoUsingDefaultConstructor {
	Lab34ClassToAcceptAndPrintInfoUsingDefaultConstructor(){
		System.out.println("Math Book");
	}
	public void mymethod() {
		System.out.println("Author: BC Bajracharya");
		System.out.println("Price: $10");
	}
	public static void main(String[] args) {
		Lab34ClassToAcceptAndPrintInfoUsingDefaultConstructor obj = new Lab34ClassToAcceptAndPrintInfoUsingDefaultConstructor();
		obj.mymethod();
	}
}
