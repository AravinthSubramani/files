import java.util.Scanner;
public class JavaApplication2 {
    public static void main(String[] args) {
        // TODO code application logic here
        String input=(new Scanner(System.in)).next(),sub="";
        for(int i=0;i<input.length();i++)
        {
            String a=input.substring(i,i+1); 
            if(!sub.contains(a))
            {
                sub=sub+a;
            }
        }
        System.out.print(sub.length());
    }
}
