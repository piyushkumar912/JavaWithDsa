// Right Angled Triangle-->
// Condition --> a*a + b*b = c*c
//(Q)
// A = 3;
// B = 4;
// C = 5;


public class rightangletriangle {
 public static void main(String[] args){
    int a = 3;
    int b = 4;
    int c = 5;
    if(a+b>c && a+c>b && b+c>a){
        if(a*a+b*b == c*c){
            System.out.println("Right angle");
        }
        else if(b*b+c*c == a*a){
            System.out.println("Rigt angle");
        }
        else if (a*a+c*c == b*b) {
            System.out.println("right angle");
        }
        else{
            System.out.println("Valid but not Right angle");
        }
        }
        else{
            System.out.println("Invalid");    
    }
 }   
}
