import java.util.*;

public class powerofthree {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<=0){
        System.out.println(false);
        }
        else{
        boolean check = true;
        while(n!=1){
            if(n%3==0){
                n = n/3;  
            }
            else{
                check = false;
                break;
            }
        }
            if(check == true){
                System.out.println(true);
            }
           else{
            System.out.println(false);~
           }
        
    }
}   ~
}
