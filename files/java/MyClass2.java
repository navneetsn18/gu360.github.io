import java.util.*;
public class MyClass2{
    public static void main(String[] agrs){
        Scanner scan = new Scanner(System.in);
        int a=0,b=0,i;
        int[] arr1,arr2;
        arr1=new int[3];
        arr2=new int[3];
        for(i=0;i<3;i++)
        {
            arr1[i]=scan.nextInt();
        }
        for(i=0;i<3;i++)
        {
            arr2[i]=scan.nextInt();
        }
        for(i=0;i<3;i++)
        {
            if(arr1[i]>arr2[i])
                a++;
            else if(arr1[i]<arr2[i])
                b++;
        }
        System.out.print(a+" "+b);
    }
}
