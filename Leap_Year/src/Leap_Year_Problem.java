import java.util.*;
public class Leap_Year_Problem
{	

	public static void main(String[] args) 
	{
		Scanner reader=new Scanner(System.in);
		int year;
		System.out.println("Enter year value to find out whether it is leap year or not:");
		year=reader.nextInt();
		if(year>999 && year<10000)//easy way to make sure that is a four digit number
		{
			if(year%4==0)//number%4 will be equal to 0 if it is a leap year other wise a non zero number will be generated.
				System.out.println(year+":is a leap year");
			else
				System.out.println(year+":is not a leap year");
		}
		else
			System.out.println("Enter a 4 digit positive integer value to check whether it is leap year or not.");
		reader.close();
	}
}