//(Q)  display all numbers entered by user except multiples of 10;

import java.util.Scanner;

public class ContinueStatements2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Enter Your Number: ");
            int n = sc.nextInt();
            if(n % 10 == 0){
                continue;
            }
            System.out.println("Number was:" + n);
        }
        while(true);
    }
}


//using for loop

// import java.util.Scanner;

// public class ContinueStatements2 {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter Your Number:");
//         int n = sc.nextInt();
//         for(int i = n; i<=n; i++){
//             if(n % 10 == 0){
//                 continue;
//             }
//             System.out.println("Number was:" + n);
//         }
//         sc.close();
//     }
// }