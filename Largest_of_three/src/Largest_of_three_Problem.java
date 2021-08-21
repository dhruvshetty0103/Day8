import java.util.*;
public class Largest_of_three_Problem 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter 3 numbers to find the largest among three:");
		Scanner reader=new Scanner(System.in);
		int a=reader.nextInt();
		int b=reader.nextInt();
		int c=reader.nextInt();
		reader.close();
		if(a==b&& b==c)//If all are equal
			System.out.println("All numbers are equal");
		else if(a>b)//No.1 greater than No.2
			if(a>c)//No.1 greater than No.3
				System.out.println("Number 1:"+a+" is the greatest among all");
			else
				System.out.println("Number 3:"+c+" is the greatest among all");
		else if(b>c)//No.2 greater than No.3
			System.out.println("Number 2:"+b+" is the greatest among all");
		else
			System.out.println("Number 3:"+c+" is the greatest among all");		
	}
}