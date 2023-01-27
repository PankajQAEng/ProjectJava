package Test;

public class ArraySorting {

	public static void main(String[] args) 
	{
		int array[]= {2,7,3,9,17,1,5} ;
		int temp=0;
		//int m
		for(int i=array.length-1;i>=0;i--) 
		{
			temp=array[i]+temp;
			
		}
		
		System.out.println(temp);
	}

}
