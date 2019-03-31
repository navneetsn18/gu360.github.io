import java.util.*;
    public class MyClass6{
        public static void main(String[] args){
            Scanner scan = new Scanner(System.in);
            int num,rnum=0,i,temp,len=0,x;
            num=scan.nextInt();
            temp=num;
            while(temp>0){
                temp/=10;
                len++;
            }
            temp=num;
            for(i=0;i<len;i++){
                x=temp%10;
                temp/=10;
                rnum=rnum*10+x;
            }
            if(num==rnum)
                System.out.print("palindrome");
            else
                System.out.print("not palindrome");
        }
    }