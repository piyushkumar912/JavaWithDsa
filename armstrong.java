import java.util.*;

public class armstrong {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n= sc.nextInt();
     int dummy = n;
     int copy = n;
     int dc = 0;
     double sum = 0;
     while(n!=0){
       dc = dc+1;
       n= n/10;
     }
     while(dummy !=0){
       int rem = dummy % 10;
       sum = sum + (int)Math.pow(rem , dc);
       dummy = dummy/10;
     }
     if(copy == sum){
       System.out .println("armstrong");
     }
     else{
       System.out.println("Not armstrong");
     }
  }
}
