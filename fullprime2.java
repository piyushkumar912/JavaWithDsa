import java.util.*;

public class fullprime2 {
        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0;

        // Prime check
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        if (count == 2) { // n prime hai
              System.out.println(true);
            int temp = n;   // 🔥 FIX: copy of n

            while (temp != 0) {
                int rem = temp % 10;

                if (rem == 0 || rem == 1 || rem == 2 || rem == 4 || rem == 6 || rem == 8) {
                    check = false;
                    break;
                }

                temp = temp / 10;
            }

            if (check) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }

        } else {
            System.out.println(false);
        }
    }
}
