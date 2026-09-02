//Q 
//a=3,b=4,c=5
//Scalene --> different
//Isocelus--> koi bhi do
//Equilateral --> teeno equal

public class conditonalstatement {
    public static void main(String[] args){
     int a=8;
     int b=8;
     int c=6;
     if(a+b>c && a+c>b && b+c>a){
        if(a==b && a==c && b==c){
            System.out.println("Equilateral");
        }
     else if(a==b||a==c||b==c){
        System.out.println("Isocelus");
     }   
     else{
        System.out.println("Scalene");
     }
     }
     else{
        System.out.println("Invalid Triangle");
     }
    }
    
}
