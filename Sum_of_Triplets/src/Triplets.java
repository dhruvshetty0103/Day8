import java.util.*;
public class Triplets 
{
	public static void main(String[] args) 
	{
		int i,j,k,n,flag=0,count=0;
		System.out.println("Enter the size of array:");
		Scanner reader=new Scanner(System.in);
		n=reader.nextInt();
		int [] arr=new int[n];
		System.out.println("Enter elements of the array:");
		for(i=0;i<n;i++)
			arr[i]=reader.nextInt();
		reader.close();
		for(i=0;i<n-2;i++)
			for(j=i+1;j<n-1;j++)
				for(k=j+1;k<n;k++)
				{
					if(arr[i]+arr[j]+arr[k]==0)
					{
						flag=1;
						count++;
						System.out.println("Triplets are:"+arr[i]+","+arr[j]+","+arr[k]);
					}
				}
		if(flag==1)
			System.out.println("Total number of triplets are:"+count);
		else
			System.out.println("No triplets found.");
	}

}
