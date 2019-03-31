import java.util.*;
     public class MyClass3{
         public static void main(String[] agrs){
            Scanner scan = new Scanner(System.in);
            int n,i,max=0,res=0;
            int[] arr;
            arr=new int[100000];
            n=scan.nextInt();
            for(i=0;i<n;i++)
            {
                arr[i]=scan.nextInt();
            }
            for(i=0;i<n;i++)
            {
                if(arr[i]>max)
                    max=arr[i];
            }
            for(i=0;i<n;i++)
            {
                if(arr[i]==max)
                    res++;
            }
            System.out.print(res);
        }
    }
