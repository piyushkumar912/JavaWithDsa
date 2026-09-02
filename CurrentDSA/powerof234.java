import java.util.Scanner;
public class powerof234 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1=n;//power of 3
        int n2=n;//power of 4
        boolean check1 = true;
        boolean check2 = true;
        boolean check3 = true;
        while(n>1){
            if(n%2==0){
                n=n/2;
            }
            else{
             check1=false;
             break;
            }
        } 
           
        while(n1>1){
            if(n1%3==0){
                n1=n1/3;
            }
            else{
             check2=false;
             break;
            }
        }
         while(n2>1){
            if(n2%4==0){
                n2=n2/4;
            }
            else{
             check3=false;
             break;
            }
        }
        if(check1==true){
            System.out.println("power of 2");
        }
        if(check2==true){
            System.out.println("power of 3");
        }
        if(check3==true){
            System.out.println("power of 4");
        }
    }
}
