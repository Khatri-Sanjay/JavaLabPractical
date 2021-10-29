package JavaLab;

public class Lab27SecondGreatestNumberOfArray {
	public static void main(String[] args) {
		int [] array = {1,2,3,4,5};
		int size = array.length;
		int temp;
		
//		System.out.println(size);
		for(int i = 0; i < size; i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(array[i]>array[j])
				{
					temp = array[i];
					array[i]= array[j];
					array[j]= temp;
				}
			}
		}
		System.out.println("Second largest number in given array is:"+(array[size-2]));
	}
}
