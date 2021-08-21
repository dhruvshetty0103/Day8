import java.util.*;
public class Distance 
{
	public static double distance(int x1,int y1)
	{
		return (double)(Math.sqrt((x1*x1)+(y1*y1)));
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter point (x,y) to find it's Euclidean distance from origin (0,0)");
		Scanner reader=new Scanner(System.in);
		int x=reader.nextInt();
		int y=reader.nextInt();
		reader.close();
		System.out.println("The distance is:"+distance(x, y));
	}

}
