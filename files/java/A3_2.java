import java.util.*;
public class A3_2
{
     public static void main(String args[])
     {
         Scanner s=new Scanner(System.in);
         int t=0,count=0,original=0;
         t=s.nextInt();
         int o;
         while(t!=0)
         {
             int n=s.nextInt();
             original=n;
             count=0;
             while(n!=0)
           {
             if(n%10!=0)
             if(original%(n%10)==0)
             count++;
             n=n/10;
           } 
         System.out.println(count);
         t--;
         }
     }
}
