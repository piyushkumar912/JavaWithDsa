import java.util.*;
public class CheckNumberPrimeOrNot {
    public static void main(String args[]){
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();

          boolean isPrime = true;
          if(n == 2){
            System.out.println("n is Prime");
          }
          else{
            for(int i = 2; i <= Math.sqrt(n); i++){   // for large number its take shorter time 
            // for(int i = 2; i <= n-1; i++){         // for samml number its take shorter time 
            if(n % i == 0){         //n is a multiple of i (i not equal to 1 or n)
                isPrime = false;
            }
          }
          if(isPrime == true){
            System.out.println("n is Prime");
          }
          else{
            System.out.println("n is not Prime");
          }
          }
    }
}




// Prime Number -- > which divided by itself and 1.
//EX--> [1 * n; & n * 1]  [1 * 2 & 2 * 1];