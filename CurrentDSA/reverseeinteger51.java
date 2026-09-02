import java.util.*;
public class reverseeinteger51 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int digit;
        int rev = 0;
        for(int i = n; i>0; i=i/10){
            digit = i % 10;
            rev = rev*10+digit;
        }
        System .out.println(rev);
    }
}
