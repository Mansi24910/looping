//perfect number using loop

import java.util.*;
public class perfectNumber
{
  public static void main(String args[])
   {
      int rem, sum = 0;
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the number");
      int n = sc.nextInt();
      int i = 1;
      while(i < n)
      {
        rem = n % i;
        if(rem == 0)
          {
            sum = sum + i;
          }
          i++;
       }
       if(sum == n)
       {
         System.out.println("number is perfect");
       }
       else
       {
         System.out.println("number is not perfect"); 
       }
    }
}