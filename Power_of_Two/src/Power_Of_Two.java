import java.util.*;
public class Power_Of_Two {

	public static void main(String[] args) 
	{
		int i,N;
		System.out.println("Enter value of N to print a table of the powers of 2 that are less than 31");
		Scanner reader=new Scanner(System.in);
		N=reader.nextInt();
		reader.close();
		
		if(N>=0 && N<31)
		{
			for(i=0;i<=N;i++)
			{
				System.out.println(Math.pow(2, i));
			}
		}
		else
			System.out.println("Value less than or greater than equal to 31 are not allowed");
		
	}

}
