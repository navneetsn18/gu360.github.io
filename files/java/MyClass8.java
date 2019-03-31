import java.util.*;
    public class MyClass8{
        public static void main(String[] args){
            Scanner scan = new Scanner(System.in);
            int num,i;
            num=scan.nextInt();
            for(i=1;i<=num;i++){
                if(i%3==0 && i%5==0)
                    System.out.println("Galgotias University");
                else if(i%3==0)
                    System.out.println("Galgotias");
                else if(i%5==0)
                    System.out.println("University");
                else
                    System.out.println(i);
            }
        }
    }