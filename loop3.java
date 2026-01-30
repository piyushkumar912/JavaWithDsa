//(Q). Print all even/odd integers from 1 to n.
    //Even--> int i = 2;i<=n;i=i+2;
    //Odd--> int i = 1;i<=n;i=i+2;
import java.util.*;
public class loop3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         //Even
        for(int i =2; i<=n;i=i+2){
            System.out.println(i);
        }
          //Odd
        for(int i =1; i<=n; i=i+2){
            System.out.println(i);
        }
        }
        }
    
