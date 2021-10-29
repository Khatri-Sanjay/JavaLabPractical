package JavaLab;

public class Lab37ObjectOfBookClassWithCallingParameterizedConstrutor {
	String bookName;
	String author;
	int price;
	Lab37ObjectOfBookClassWithCallingParameterizedConstrutor(String bookName, String author, int price){
	this.bookName = bookName;
	this.author = author;
	this.price = price;
	}
	void infoDisplay(){
	System.out.println("Name: " + bookName);
	System.out.println("Author: " + author);
	System.out.println("Price: " + price);
	}
	public static void main(String[] args){
	Lab37ObjectOfBookClassWithCallingParameterizedConstrutor book = new Lab37ObjectOfBookClassWithCallingParameterizedConstrutor("Nepali","Ram Parshad Dhakal",425);
	book.infoDisplay();
	}
}
