package Wcem_Java;

public class PrimeNumber {

	public static void main(String[] args) 
	{
		int Num=;
		int count=0;
		for(int i=2;i<=Num-1;i++) 
		{
			if(Num%i==0) 
			{
				count=1;
			}
		}
		if(count==0) 
		{
			System.out.println("Prime Number");
		}
		else 
		{
			System.out.println("Not Prime NUmber");
		}
	}

}
