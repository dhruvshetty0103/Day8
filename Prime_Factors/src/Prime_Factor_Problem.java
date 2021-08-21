import java.util.*;
public class Prime_Factor_Problem
{
	public static void main(String[] args) 
	{
		System.out.println("Enter N number to find it's factor:");
		Scanner reader=new Scanner(System.in);
		int N=reader.nextInt();
		reader.close();
		while(N%2==0)//To display all prime numbers which contains 2
		{
			System.out.println("2");
			N=N/2;
		}
		for(int i=3;i<=Math.sqrt(N);i=i+2)//From 3 to square root of N
		{
			while(N%i==0)
				{
					System.out.println(i);
					N=N/i;
				}
		}
		if(N>2)//To display the last prime factor or if it is prime number
			System.out.println(N);
	}

}