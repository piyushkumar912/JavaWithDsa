import java.util.*;
class fullprime1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count =0;
        for(int i = 1;i<=n;i++){
            if(n%i==0){
                count++;
            }
    }
    if(count == 2){//n prime hai
        boolean check = true;
        while(n != 0){
            int rem = n % 10;
            if(rem == 0 || rem == 1  || rem == 2 || rem == 4 || rem == 6 || rem ==8){
                check = false;
                break;
            }
            n = n /10;
        }
        if(check == true){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
    else{
        System.out.println(false);
    }
}
}
