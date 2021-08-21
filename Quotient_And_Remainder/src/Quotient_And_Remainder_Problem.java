import java.util.*;
public class Quotient_And_Remainder_Problem 
{
	public static void main(String[] args) 
	{
		int quotient,remainder;
		System.out.println("Enter number to and divisor to get quotient and divisor:");
		Scanner reader=new Scanner(System.in);
		int number=reader.nextInt();
		int divisor=reader.nextInt();
		reader.close();
		quotient=number/divisor;
		remainder=number%divisor;
		System.out.println("Quotient:"+quotient);
		System.out.println("Remainder:"+remainder);
	}

}
