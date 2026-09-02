public class TypePromotion {
    public static void main(){
        // char a = 'a'; //(97)
        // char b = 'b'; //(98)
        // System.out.println(b-a); // Type promotion ke liye jaise hi hm expressin me convert krte hai to java automatic char ko int me convert kr deta hai ...
        
        // short a = 5;
        // byte b = 25;
        // char c = 'c';
        // byte bt = (byte)(a + b + c);
        // System.out.println(bt);

        // int a = 10;
        // float b = 20.25f;
        // long c = 25;
        // double d = 30;
        // double ans = a + b + c + d;
        // System.out.println(ans);

        byte b = 5;
        byte a =  (byte)(b * 2);
        System.out.println(a);
    }
}
