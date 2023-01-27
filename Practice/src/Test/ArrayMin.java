package Test;

public class ArrayMin {

	public static void main(String[] args) {
		
		int b[]= {12,34,56,7,45,67,89};
		
		int min=b[0];
		
		for(int i=0;i<b.length;i++) 
		{
			if(min>b[i]) 
			{
				min=b[i];
			}
		}
		System.out.println("Minimum Number In array is::"+min);
		
		
	}

}
