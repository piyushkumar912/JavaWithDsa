
import java.util.*;
public class ReverseOfNumber {
    public static void main(String args[]){
        int n = 23456789;

        while(n > 0){
            int lastDigit = n % 10;
            System.out.print(lastDigit);
            n /= 10;                       //n = n/10;
        }
    }
}
