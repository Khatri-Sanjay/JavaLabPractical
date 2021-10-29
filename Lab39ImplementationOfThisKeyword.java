package JavaLab;

class Bike{
		int bikeNo;
		String bikeName;
		float bikePrice;
		Bike(int bikeNo,String bikeName, float bikePrice){
			this.bikeNo = bikeNo;
			this.bikeName = bikeName;
			this.bikePrice = bikePrice;
		}
		void display()
			{
				System.out.println(bikeNo + " " + bikeName + " Rs." + bikePrice);
			}
}

	public class Lab39ImplementationOfThisKeyword{
			public static void main(String[] args){
				Bike b = new Bike(4262, "FZS", 260000f);
				b.display();
			}
}