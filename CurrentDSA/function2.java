public class function2 {
    public static void main(String[] args) {
        int n = 12345;
        System.out.println(reverse(n));
        System.out.println(sum(n));
        System.out.println(primesum(n));
    }

    public static int reverse(int n){
        int rev = 0;
        while(n != 0){
            int rem = n % 10;
            rev = rev*10 + rem;
            n = n/10;
        }
        return rev;
    }

public static int sum(int n){
    int s =0;
    while(n != 0){
        int rem = n % 10;
        s = s + rem;   // add digit
        n = n / 10;  //  reduce number
    }
    return s;
    }

public static int primesum(int n){
    int ps = 0;
    while(n != 0){
        int rem = n % 10;
        if(rem==2 || rem==3 || rem==5 || rem==7){
            ps = ps + rem;
        }
        n = n / 10;
    }
    return ps;
}
}

