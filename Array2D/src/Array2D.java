import java.util.*;
public class Array2D 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter size M & N for columns and rows array ");
		Scanner reader=new Scanner(System.in);
		int M=reader.nextInt();
		int N=reader.nextInt();
		int [][] arr=new int[M][N];
		int i,j;
		System.out.println("Enter the array elements:");
		for(i=0;i<M;i++)
			for(j=0;j<N;j++)
				arr[i][j]=reader.nextInt();
		System.out.println("2D array is stored as follows:");
		for(i=0;i<M;i++)
		{	
			for(j=0;j<N;j++)
			{
				System.out.print(arr[i][j]+" ");//I don't know Output Stream Writer as of now so displaying array elements in this way
			}
			System.out.println("");
		}		 
	}

}
