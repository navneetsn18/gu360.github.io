import java.util.*;
    public class MyClass1{
        public static void main(String[] agrs){
            Scanner scan = new Scanner(System.in);
            int i,lar=0;
            int[] arr;
            arr=new int[3];
            for(i=0;i<3;i++)
            {
                arr[i]=scan.nextInt();
            }
            for(i=0;i<3;i++)
            {
                if(arr[i]>lar)
                    lar=arr[i];
            }
            System.out.print(lar);
        }
    }
