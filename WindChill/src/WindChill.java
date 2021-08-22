
public class WindChill 
{
	public static void main(String[] args) 
	{
		{
			double t,v,w=0;			
			t=Double.parseDouble(args[0]);//To reader t from command line interface
			v=Double.parseDouble(args[1]);//To reader t from command line interface
			
			if(t<50 && v<120 && v>3)
				w=35.74+(0.6215*t)+(((0.4275*t)-35.75)*(Math.pow(v, 0.16)));//Math.pow() function used to calculate the effective temperature
			else
				System.out.println("The formula is not valid if t is larger than 50 in absolute value or if v is larger than 120 or less than 3");
			System.out.println("The effective temperature(the wind chill) is:"+w);
		}
	}

}
