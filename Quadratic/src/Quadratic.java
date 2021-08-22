import java.util.*;
public class Quadratic 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter values of a,b and c for a quadratic question:");
		Scanner reader= new Scanner(System.in);
		int a=reader.nextInt();
		int b=reader.nextInt();
		int c=reader.nextInt();
		reader.close();
		double delta=(Math.pow(b, 2))-(4*a*c);//formula to compute d with the help of Math.pow() function
		double root1=(-b+Math.sqrt(delta))/(2*a);//formula to compute root1 with the help of Math.sqrt() function
		double root2=(-b-Math.sqrt(delta))/(2*a);//formula to compute root2 with the help of Math.sqrt() function
		System.out.println("Root 1:"+root1);
		System.out.println("Root 2:"+root2);
	}

}
