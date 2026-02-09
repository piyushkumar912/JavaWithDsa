//(Q)-->Print Triangle

import java.util.*;
public class pattern8 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++){ 
            for(int j = 1; j<=n-i;j++){ //Space
                System.out.print(" ");
            }
            for(int j = 1; j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
            System.out.println("Hello world ");

        }
    }
}
