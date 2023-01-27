package Test;

public class ReveseString {

	public static void main(String[] args) 
	{
	 String s="welcome java class";
	 
	 String d[]=s.split(" ");
	 
	 String a="";
	 
	 for( String w:d) 
	 {
		 String rev="";
		 for(int i=w.length()-1;i>=0;i--) 
		 {
			 rev=rev+w.charAt(i);
			 
		 }
		
     a=a+rev+" ";
     
	 }
	 
	 System.out.println(a);

	}

}
