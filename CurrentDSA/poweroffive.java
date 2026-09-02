import java.util.Scanner;

public class poweroffive {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<=0){
          System.out.println(false);
        } 
        else{
            boolean check = true;
            while(n!=1){
                if(n%5==0){
                    n = n/5;
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
