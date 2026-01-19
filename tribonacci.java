import java.util.*;
public class tribonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Hello baby");
        int n = sc.nextInt();
        if(n==0 || n==1){
            System.out.println(n);
        }
        else if(n==2){
            System.out.println(1);
        }
        else{
            int a=0;
            int b=1;
            int c=1;
            int sum=0;
            for(int i = 3; i<=n; i++){
                sum  = a+b+c;
                a=b;
                b=c;
                c=sum;
            }
            System.out.println(sum);
        }
        }
    }

