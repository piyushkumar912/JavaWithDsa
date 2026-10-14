import java.util.*;
public class StarPattern {
    public static void main(String args[]){
        for(int line = 1; line <= 5; line++){
            for(int star = 1; star <= line; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}




//(Nested loop) means ---> loop ke andar ek loop....

// import java.util.*;
// public class StarPattern{
//     public static void main (String args[]){
//         for(int i = 1; i <= 5; i++){
//             for(int j = 1; j <= i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }