import java.util.*;
public class fibonaccinumber {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==0 || n==1){
            System.out.println(n);
        }
        int a = 0;
        int b = 1;
        int sum = 0;
        for(int i =2; i<=n; i++){
            sum=a+b;
            a=b;
            b=sum;
        };
        System.out.println(sum);
    }
}
