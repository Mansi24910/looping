import java.util.*;
public class asd
{
	public static void main(String args[])
	{
		
	Scanner sc = new Scanner(System.in);
	int a[] = new int[4];
	System.out.println("enter the array");
	for(int i=0;i<a.length;i++)
	{
		a[i] = sc.nextInt();
	}
	System.out.println("enter the value");
	int n = sc.nextInt();
	int left =0;
	for(int i=0;i<a.length;i++)
	{
		if(a[i]!=n)
		{
			a[left]=a[i];
			left++;
		}
	}
	System.out.println("final array");
	for(int i=0;i<left;i++)
	{
		System.out.println(a[i]);
		
	}
	
	System.out.println("Coount="+(left));
}
}

