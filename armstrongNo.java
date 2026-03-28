import java.util.*;
public class armstrongNo {
    public static void main(String[] args) {
      //  Scanner sc = new Scanner(System.in);
        int n = 153;
        System.out.println(armstrongNo(n));
      
    }
            public static boolean armstrongNo(int n){ //
            int  d1= n;
            int d2 = n;
            int count =0;
            while(n!=0){
                count++;
                n  = n/10;
            }
            int sum =0;
            while(d1 !=0){
                int rem  = d1 % 10;
                sum  =sum +(int)Math.pow(rem,count);
                d1 = d1 / 10;
            }
            if(d2 == sum){
                return true;
            }
            return false;
        }
        
}
