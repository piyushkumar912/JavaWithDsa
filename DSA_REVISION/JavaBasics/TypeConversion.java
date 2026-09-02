import java.util.*;
public class TypeConversion {
    public static void main(String args[]){
        // int a = 10;
        // long b = a;
        // System.out.println(b);
        Scanner sc = new Scanner(System.in);
        float number = sc.nextInt();
        System.out.println(number);
    }
}




// "int" ka value ko "long" me assign krne ke liye java allow krta hai ...
// But "long" ke value ko "int" me assign krne ke liye java allow nahi krta hai ... 
//Isile java me bede or compatible datatype me chhothe koo store krwate hai ...Is flow me --->{byte > short > int > float > long > double}....