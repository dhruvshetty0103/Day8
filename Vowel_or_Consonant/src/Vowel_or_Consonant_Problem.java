import java.util.*;
public class Vowel_or_Consonant_Problem
{
	public static void main(String[] args) 
	{
		System.out.println("Enter alphabet to find out is it vowel or consonant:");
		Scanner reader=new Scanner(System.in);
		char ch=reader.next().charAt(0);
		reader.close();
		if( ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u' ||ch=='A' ||ch=='E' ||ch=='I' ||ch=='O' ||ch=='U')//Comparing character with vowels is true 1
			System.out.println("It is a Vowel");
		else//Otherwise it is consonant
			System.out.println("It is a Consonant");
	}

}
