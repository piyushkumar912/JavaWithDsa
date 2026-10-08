public class BreakStatements {
    public static void main (String args []){
        for(int i = 1; i <= 5; i++){
            if(i == 3){
                break;
            }
            System.out.println(i);
        }
        System.out.println("Iam out of the Loop");
    }
}


//Break Statements --> to exist the loop..