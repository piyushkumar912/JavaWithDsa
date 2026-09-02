import java.util.*;
public class LargestOf3Numbers {
    public static void main(String args[]){
        int A = 1, B = 3, C = 6;
        if(A >= B && A >= C){
            System.out.println("A is Largest");
        }
        else if(B >= A && B >= C){
            System.out.println("B is Largest");
        }
        else{
            System.out.println("C is Largest");
        }
    }
}
