//(Q)  Keep entering numbers till user enters a multiple of 10..

import java.util.Scanner;

public class BreakStatements2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Enter Your number:");
            int n = sc.nextInt();
            if(n % 10 == 0){
                break;
            }
            System.out.println(n);
        }
        while(true);
        sc.close();
    }
}


//using for loop


// import java.util.Scanner;

// public class BreakStatements2 {
//     public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter your Number: ");
//     int n = sc.nextInt();
    
//     for(int i = n; i<= n; i++){
//         if(n % 10 == 0){
//             break;
//         }
//         System.out.println(n);
//     }
//     sc.close();
//     }
// }

     //Explation of the code..

//(Q)1 se lekar n tak saare numbers print hon, lekin jaise hi 10 ka multiple mile, loop break ho jaye.     

// int i = 1 — counting 1 se start hogi.
// i <= n — loop n tak chalega.
// i % 10 == 0 — check karega ki number 10 ka multiple hai ya nahi.
// break — jaise hi 10 milega, loop turant stop ho jayega.
// System.out.println(i) — baaki numbers print karega, lekin 10 print nahi hoga.
// sc.close() → Scanner ko close karne aur resources release karne ke liye.