import java.util.Scanner;

public class poweroffour {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if(n<=0){
        System.out.println(false);
    }
    else{
        boolean check = true;
        while(n!=1){
            if(n%4==0){
                n = n/4;
            }
            else{
                check = false;
                break;
            }
            }
            if(check==true){
                System.out.println(true);
            }
            else{
                System.out.println(false);
            }
            }
        }
    }
   
