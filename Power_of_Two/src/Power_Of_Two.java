public class Power_Of_Two 
{
	public static void main(String[] args) 
	{
		double N;			
		N=Double.parseDouble(args[0]);//To read N from command line interface
		if(N>=0 && N<31)//0<=N<31
		{
			for(int i=0;i<=N;i++)
			{
				System.out.println(Math.pow(2, i));//Math.pow used generate 2^N
			}
		}
		else
			System.out.println("Value less than or greater than equal to 31 are not allowed");
	}
}