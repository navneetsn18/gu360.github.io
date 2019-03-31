import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
    public class MyClass11{
        public static void check(String email){
            String emailRegex = "^[\\w\\d]{5,}+@+[\\w\\d]{2,}+\\.+[\\w\\d]{1,3}$";
            Pattern pat = Pattern.compile(emailRegex); 
            if (email == null || !pat.matcher(email).matches()) 
                System.out.print("Invalid Email");
            else
                System.out.print("Valid Email"); 
        }
        public static void main(String[] args){
            Scanner scan=new Scanner(System.in);
            String email;
            email=scan.nextLine();
            check(email);
        }   
    }