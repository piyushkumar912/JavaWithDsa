//print given name in a function....

import java.util.*;
public class function1 {
    public static void printMyname(String name) {
       System.out.println(name);
       return;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        printMyname (name);  // function ko call kiya
    }
}
