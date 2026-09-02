public class ConditionalPractice {

    public static void main(String[] args) {

        System.out.println("===== JAVA CONDITIONAL PRACTICE =====\n");

        // 1.Positive / Negative / Zero
        int num1 = -5;
        if (num1 > 0)
            System.out.println("1. Positive");
        else if (num1 < 0)
            System.out.println("1. Negative");
        else
            System.out.println("1. Zero");

        // 2.Even or Odd
        int num2 = 7;
        if (num2 % 2 == 0)
            System.out.println("2. Even");
        else
            System.out.println("2. Odd");

        // 3. Greatest of Two Numbers
        int a = 10, b = 20;
        if (a > b)
            System.out.println("3. a is greater");
        else
            System.out.println("3. b is greater");

        // 4. Voting Eligibility
        int age = 17;
        if (age >= 18)
            System.out.println("4. Eligible to vote");
        else
            System.out.println("4. Not eligible to vote");

        // 5. Divisible by 3 and 5
        int num3 = 15;
        if (num3 % 3 == 0 && num3 % 5 == 0)
            System.out.println("5. Divisible by 3 and 5");
        else
            System.out.println("5. Not divisible by both");

        // 6. Grade Calculator
        int marks = 76;
        if (marks >= 90)
            System.out.println("6. Grade A");
        else if (marks >= 75)
            System.out.println("6. Grade B");
        else if (marks >= 60)
            System.out.println("6. Grade C");
        else if (marks >= 40)
            System.out.println("6. Grade D");
        else
            System.out.println("6. Fail");

        // 7. Largest of Three Numbers
        int x = 5, y = 12, z = 9;
        if (x >= y && x >= z)
            System.out.println("7. x is largest");
        else if (y >= x && y >= z)
            System.out.println("7. y is largest");
        else
            System.out.println("7. z is largest");

        // 8. Leap Year
        int year = 2024;
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
            System.out.println("8. Leap Year");
        else
            System.out.println("8. Not a Leap Year");

        // 9. Character is vowel or consonant
        char ch = 'a';
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            System.out.println("9. Vowel");
        else
            System.out.println("9. Consonant");

        // 10. Alphabet / Digit / Special Character
        char c = '@';
        if (c >= '0' && c <= '9')
            System.out.println("10. Digit");
        else if (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z')
            System.out.println("10. Alphabet");
        else
            System.out.println("10. Special Character");

        // 11. Uppercase or Lowercase
        char ch2 = 'G';
        if (ch2 >= 'A' && ch2 <= 'Z')
            System.out.println("11. Uppercase");
        else
            System.out.println("11. Lowercase");

        // 12. Simple Calculator (switch)
        int n1 = 10, n2 = 5;
        char operator = '*';
        switch (operator) {
            case '+':
                System.out.println("12. Result = " + (n1 + n2));
                break;
            case '-':
                System.out.println("12. Result = " + (n1 - n2));
                break;
            case '*':
                System.out.println("12. Result = " + (n1 * n2));
                break;
            case '/':
                System.out.println("12. Result = " + (n1 / n2));
                break;
            default:
                System.out.println("12. Invalid operator");
        }

        // 13. Day of Week
        int day = 3;
        switch (day) {
            case 1: System.out.println("13. Monday"); break;
            case 2: System.out.println("13. Tuesday"); break;
            case 3: System.out.println("13. Wednesday"); break;
            case 4: System.out.println("13. Thursday"); break;
            case 5: System.out.println("13. Friday"); break;
            case 6: System.out.println("13. Saturday"); break;
            case 7: System.out.println("13. Sunday"); break;
            default: System.out.println("13. Invalid day");
        }

        // 14. Triangle Validity
        int s1 = 5, s2 = 3, s3 = 9;
        if (s1 + s2 > s3 && s1 + s3 > s2 && s2 + s3 > s1)
            System.out.println("14. Valid Triangle");
        else
            System.out.println("14. Invalid Triangle");

        // 15. Triangle Type
        int t1 = 5, t2 = 5, t3 = 5;
        if (t1 == t2 && t2 == t3)
            System.out.println("15. Equilateral Triangle");
        else if (t1 == t2 || t2 == t3 || t1 == t3)
            System.out.println("15. Isosceles Triangle");
        else
            System.out.println("15. Scalene Triangle");

        // 16. ATM Withdrawal
        int balance = 5000, withdraw = 4600;
        if (withdraw % 100 == 0 && balance - withdraw >= 1000)
            System.out.println("16. Withdrawal Successful");
        else
            System.out.println("16. Withdrawal Failed");

        // 17. Shopping Discount
        int amount = 3500;
        if (amount >= 5000)
            System.out.println("17. Discount = 20%");
        else if (amount >= 3000)
            System.out.println("17. Discount = 10%");
        else if (amount >= 1000)
            System.out.println("17. Discount = 5%");
        else
            System.out.println("17. No Discount");

        // 18. Login Validation
        String username = "admin";
        String password = "1234";
        if (username.equals("admin") && password.equals("1234"))
            System.out.println("18. Login Successful");
        else
            System.out.println("18. Login Failed");

        // 19. Ternary Operator (Pass/Fail)
        int score = 38;
        String result = (score >= 40) ? "Pass" : "Fail";
        System.out.println("19. Result = " + result);

        // 20. Odd or Even without %
        int num4 = 6;
        if ((num4 & 1) == 0)
            System.out.println("20. Even (Bitwise)");
        else
            System.out.println("20. Odd (Bitwise)");

        System.out.println("\n===== END OF PRACTICE =====");
    }
}
