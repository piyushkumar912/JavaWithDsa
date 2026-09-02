//Logical Operators (&&, ||, !)

import java.util.*;
public class Arithematic3 {
    public static void main(String args[]){
        System.out.println((3>2) && (5>0)); //Logical AND
        System.out.println((3>2) && (5<0));
        System.out.println((3<2) && (5>0));
        System.out.println((3<2) && (5<0));

        System.out.println((3>5) || (5>0)); //Logical OR
        System.out.println((3>2) || (5<0));
        System.out.println((3<2) || (5>0));
        System.out.println((3<2) || (5<0));

        System.out.println(!(3>2)); //Logical NOT
        System.out.println(!(5<4));
    }
}
