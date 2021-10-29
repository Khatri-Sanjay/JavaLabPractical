package JavaLab;

public class Lab35StudentInfoUsingOverloadedConstructor {
	   private int stuID;
	   private String stuName;
	   private int stuAge;
	   Lab35StudentInfoUsingOverloadedConstructor()
	   {
	       //Default constructor
	       stuID = 100;
	       stuName = "New Student";
	       stuAge = 18;
	   }
	   Lab35StudentInfoUsingOverloadedConstructor(int num1, String str, int num2)
	   {
	       //Parameterized constructor
	       stuID = num1;
	       stuName = str;
	       stuAge = num2;
	   }
	   //Getter and setter methods
	   public int getStuID() {
	       return stuID;
	   }
	   public void setStuID(int stuID) {
	       this.stuID = stuID;
	   }
	   public String getStuName() {
	       return stuName;
	   }
	   public void setStuName(String stuName) {
	       this.stuName = stuName;
	   }
	   public int getStuAge() {
	       return stuAge;
	   }
	   public void setStuAge(int stuAge) {
	       this.stuAge = stuAge;
	   }

	   public static void main(String args[])
	   {
	       //This object creation would call the default constructor
		   Lab35StudentInfoUsingOverloadedConstructor s1 = new Lab35StudentInfoUsingOverloadedConstructor();
	       System.out.println("Student Name is: "+s1.getStuName());
	       System.out.println("Student Age is: "+s1.getStuAge());
	       System.out.println("Student ID is: "+s1.getStuID());

	       /*This object creation would call the parameterized
	        * constructor StudentData(int, String, int)*/
	       Lab35StudentInfoUsingOverloadedConstructor s2 = new Lab35StudentInfoUsingOverloadedConstructor(1, "Sanjay", 20);
	       System.out.println("Student Name is: "+s2.getStuName());
	       System.out.println("Student Age is: "+s2.getStuAge());
	       System.out.println("Student ID is: "+s2.getStuID()); 
	  }
	}
