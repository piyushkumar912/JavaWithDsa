import java.util.*;
public class function {
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     printSquarePattern(n);
     printRightTriangle(n);
     printBinary(n);
     printHollow(n);
     printTriangle(n);
     printSingleButterflyWing(n);
     printButterfly(n);
    }
    public static void printSquarePattern(int n){
        for(int i =1;i<=n;i++){
            for(int j =1; j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void printRightTriangle(int n){
        for(int i = 1;i<=n;i++){
            for(int j = 1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void printBinary(int n){
        for(int i=1; i<=n;i++){
            for(int j =1;j<=i;j++){
                if(i %2 == 0){
                    if(j%2 == 0){
                        System.out.print(0);
                    }
                    else{
                        System.out.print(1);
                    }
                }
                else{
                    if(j%2==0){
                        System.out.print(1);
                    }
                    else{
                        System.out.print(0);
                    }
                }
            }
            System.out.println();
        }
    }
    public static void printHollow(int n){
        for(int i =1; i<=n;i++){
            for(int j =1; j<=n;j++){
                if(i==1 || i==n){
                    System.out.print("*");
                }
                else{
                    if(j==1 || j==n){
                    System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
    public  static void printTriangle(int n){
     for(int i = 1; i<=n; i++){ 
            for(int j = 1; j<=n-i;j++){ //Space
                System.out.print(" ");
            }
            for(int j = 1; j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
    public static void printSingleButterflyWing(int n){
        for(int i = 1;i<=n;i++){
        for(int j = 1;j<=i;j++){
          System.out.print("*");
        }
        System.out.println();
      }
      for(int i = n-1;i>=1;i--){
        for(int j = 1;j<=i;j++){
          System.out.print("*");
        }
        System.out.println();
      }
    }
    public static void printButterfly(int n){
        for(int i =1;i<=n;i++){
        for(int j =1;j<=i;j++){
          System.out.print("*");
        }
        for(int j =1;j<=2*(n-i);j++){
          System.out.print(" ");
        }
        for(int j =1;j<=i;j++){
          System.out.print("*");
        }
        System.out.println();
      }
      for(int i =n-1;i>=1;i--){
        for(int j =1;j<=i;j++){
          System.out.print("*");
        }
        for(int j =1;j<=2*(n-i);j++){
          System.out.print(" ");
        }
        for(int j =1;j<=i;j++){
          System.out.print("*");
        }
        System.out.println();
      }
    }
}
