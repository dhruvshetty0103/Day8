import java.util.*;
public class Swap_Two_Numbers_Problem 
{
	public static void main(String[] args) 
	{
		int num1,num2,temp;
		System.out.println("Enter two numbers num1 and num2:");
		Scanner reader=new Scanner(System.in);
		num1=reader.nextInt();
		num2=reader.nextInt();
		reader.close();
		System.out.println("Number 1:"+num1+" Number 2:"+num2);
		temp=num1;//Temporary variable used to store value of number 1
		num1=num2;//Value of number 1 replaced with number 2
		num2=temp;//Value of number 2 is replaced with number 1 which was stored in temporary variable
		System.out.println("Number 1:"+num1+" Number 2:"+num2);
	}
}