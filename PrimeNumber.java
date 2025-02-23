import java.util.*;
public class PrimeNumber
{
	public static void main(String args[])
	{
		//int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		int i = 2;
		while(i <= n)
		{
			int j = 2;
			while(j <= i)
			{
				if(i==j)
				{
					System.out.println("prime number is" +i);
					//sum = sum + i; SUM OF PRIME NUMBER
				}
				if(i%j==0)
				{
					break;
				}
				j++;
			}
			i++;
			
			
		}
		//System.out.println("Sum of prime number is "+sum);
		
	}
}
			


			
