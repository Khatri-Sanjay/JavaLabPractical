package JavaLab;

public class Lab26GreatestNumberOfArray {
	public static void main(String[] args) {  
		   
        int [] arr = new int [] {25, 11, 7, 5, 56};  
        
        int max = arr[0];  
         
        for (int i = 0; i < arr.length; i++) {  
             
           if(arr[i] > max)  
               max = arr[i];  
        }  
        System.out.println("Largest number in given array: " + max);  
    }  
}
