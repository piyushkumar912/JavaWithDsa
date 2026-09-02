import java.util.*;
public class TernaryOperators {
    public static void main(String args[]){
        int number = 4;
        //Using Ternary operators
        String type = ((number % 2) == 0) ? "Even" : "Odd";
        System.out.println(type);
    }
}


//Syntax of ternary operators ---> variables = condition ? statements1 : statements2;