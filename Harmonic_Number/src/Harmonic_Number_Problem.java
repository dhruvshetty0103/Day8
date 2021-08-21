import java.util.*;
public class Harmonic_Number_Problem {

	public static void main(String[] args) 
	{
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter N harmonic value:");
		double harmonicValue=reader.nextDouble();//Reading N value
		double harmonicNValue=0;
		for(double i=1;i<=harmonicValue;i++)
		{
			harmonicNValue+=(1/i);
		}
		System.out.println(harmonicNValue);//Harmonic value displayed for nth value
		reader.close();
	}

}
