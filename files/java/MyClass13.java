import java.util.*;
public class b {
    
    public static void main(String[] args) {
        
        Scanner any=new Scanner(System.in);
        String input=any.nextLine();
        
        String words[] = input.split(" "); 
        int i =words.length;int l=1;
        for(String word : words) { 
            if(l<i&&word.length()>1){
            System.out.print(Character.toUpperCase(word.charAt(0)) + ".");l++;}
            else{System.out.println(word);}
        }
        
    }

}

