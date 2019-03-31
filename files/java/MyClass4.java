import java.util.*;
    public class MyClass4{
        public static void main(String[] args){
            Scanner scan = new Scanner(System.in);
            int i,j,n,x;
            n=scan.nextInt();
            for(i=0;i<n;i++)
            {
                x=1;
                for(j=0;j<=i;j++)
                {
                    System.out.print(x++);
                }
                System.out.println();
            }
        }
    }