//(Q).Sum of all integers
    // only even number use--> ( int i = 2; i<=n ; i=i+2)
   // only odd number use --> (int i = 1; i<=n; i=i+2)


import java.util.*;
public class loop4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i= 1;i<=n;i=i+1){
            sum = sum + i;
            System.out.println(sum);
        }
    }
}
