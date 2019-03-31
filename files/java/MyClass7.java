import java.util.*;
    public class MyClass7{
        public static void main(String[] args){
            Scanner scan = new Scanner(System.in);
            int num,rnum=0,i,temp,len=0,x;
            num=scan.nextInt();
            if(num>=0)
            {
                temp=num;
                while(temp>0){
                    temp/=10;
                    len++;
                }
                for(i=0;i<len;i++){
                    x=num%10;
                    num/=10;
                    rnum=rnum*10+x;
                }
                System.out.print("Reverse is "+rnum);
            }
            else
                System.out.print("Not Possible case test4");
        }
    }