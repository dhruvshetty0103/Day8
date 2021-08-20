import java.util.*;


public class Flip_Coin 
{
	public static final float min=0,max=1;
	public static void main(String[] args) 
	{
		
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter the number of times you want to flip coin:");
		float flipTimes=reader.nextInt();
		reader.close();
		float randomNo;
		int countTail=0,countHeads=0;
		if(flipTimes>0)
		{
			while(flipTimes!=(countHeads+countTail))
			{
				{
					randomNo=min + (float)(Math.random() * ((max - min)));
					System.out.println(randomNo);
					if(randomNo<0.5)
						countTail++;
					else
						countHeads++;
				}
				
			}
			System.out.println("Percentage of Heads is:"+((countHeads/flipTimes)*100)+" vs percentage of tails"+((countTail/flipTimes)*100));
		}
		else
			System.out.println("Enter positive value");
			
	}

}
