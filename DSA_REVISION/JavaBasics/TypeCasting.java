import java.util.*;
public class TypeCasting {
    public static void main(){
          float a = 25.12f;
          int b = (int)a;
          System.out.println(b);
          char ch = 'a';
          char ch2 = 'b';
          int number = ch;
          int number2 = ch2;
          System.out.println(number);
          System.out.println(number2);
    }
}


// Type Casting ko --> Narrowing Conversion or Explict conversion kahte hai
// Isme hm data ko lose kr dete hai jaose ki "float" ke data 25.999f ko "int" me assign krwane ke badd only 25 bachta hai ...
// har "character" ke ek number hote hai like 'a' ka 97 hoga or iske badd jo bhi "charactetr" aayega uska continue number increase krte jayega ... 