import java.util.*;
public class uglynumber {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<=0){
            System.out.println(false);
        }
        while(n>1){
            if(n%2==0){
                n=n/2;
            }
            else if(n%3==0){
                n=n/3;
            }
            else if(n%5==0){
                n=n/5;
            }
            else{
            System.out.println(false);
            }
            }
            System.out.println(true);
        }
    }
