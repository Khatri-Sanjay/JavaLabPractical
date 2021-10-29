package JavaLab;

class Animal{
	String color= "red";
}

class Rabbit extends Animal{
	String color = "White";
	void printColor(){
	System.out.println("Rabbit color: " + color); // prints color of Rabbit
	System.out.println("Animal color: " + super.color); //prints color of animal
	}
}

	public class Lab39ImplementationOfSuperKeyword{
		public static void main(String[] args){
		Rabbit r = new Rabbit();
		r.printColor();
	}
}
