package Test;

public class Arraymax 
{
  

public static void main(String[]args) 
{
	int a[]= new int [5];
	  
	  a[0]=9;
	  a[1]=6;
	  a[2]=3;
	  a[3]=21;
	  a[4]=44;
int max=a[0];
	  for(int i=0;i<a.length;i++) 
	  {
		  if(max<a[i]) 
		  {
			  max=a[i];
			  
		  }
		  
		  
		  
	  }
	
	System.out.println(max);
	
}	
}

