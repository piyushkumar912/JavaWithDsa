import java.util.*;

public class pattern3 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     for(int i =1; i<=n;i++){//rows
       for(int j =1;j<=i;j++){//column
         if(i % 2 == 0){//1 is even
           if(j % 2 == 0){//1 is even
             System.out.print(1);
           }
           else{
             System.out.print(0);
           }
         }
         else{//when i is odd
           if(j % 2 == 0){// when j is even
             System.out.print(0);
           }
           else{
             System.out.print(1);
           }
         }
       }
       System.out.println();
      }
    }
}
