package Test;

public class RemoveDuplicate {

	public static void main(String[] args) 
	
	{
		String st="Pankaj";
		
		String rem="";
		
		for(int i=0;i<st.length();i++)
		{
			char ch=st.charAt(i);
			if(ch!=' ')
			{
				rem=rem+ch;
				st=st.replace(ch,' ');
			}
			
		}
		System.out.println(rem);
	}

}
