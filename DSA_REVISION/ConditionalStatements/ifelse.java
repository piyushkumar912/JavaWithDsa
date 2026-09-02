import java.util.*;
public class ifelse {
    public static void main(String arg[]){
        int age = 21;
        if(age >= 18){
            System.out.println("Adult : Drive, Vote, Sex");
        }
        if(age >13 && age < 18){
            System.out.println("Teen Ager");
        }
        else{
            System.out.println("Not Adult");
        }
    }
}
