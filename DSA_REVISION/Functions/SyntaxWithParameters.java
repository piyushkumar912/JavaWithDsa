import java.util.Scanner;

public class SyntaxWithParameters {  //input type of the code
    public static int CalculateSum(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = CalculateSum(a,b); //Function call 
        System.out.println("sum:"+ sum);
    }
}
