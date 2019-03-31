import java.util.*;
    public class MyClass10{
        public static void main(String[] args){
            Scanner scan = new Scanner(System.in);
            int i,j,x=1;
            for(i=0;i<4;i++)
            {
                for(j=0;j<4;j++)
                {
                    if(i==j || i>j)
                        System.out.print(x++ + " ");
                }
                System.out.println();
            }
        }
    }
