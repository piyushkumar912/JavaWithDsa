abstract class RBI{//controller
abstract void interestRate(); // fixed and decided by
abstract void interestOnRd();
// abstract void inerestOnFd();
   }
class PNB extends RBI{
    void interestRate(){ // fixed and decided by RBI
    System.out.println("8 % on Home loan");
    }
    void interestOnRd(){
        System.out.println(" 8.5 % on RD");
    }
}
class SBI extends RBI{
    void interestRate(){ // fixed and decided by RBI
        System.out.println("6 % on Car loan");
    }
    void interestOnRd(){
        System.out.println(" 8.5 % on RD");
    }
}
class Main{
    public static void main(String[] args){
        PNB c1 = new PNB(); // object created in individuals Bank
        c1.interestRate();
        c1.interestOnRd();
        SBI c2 = new SBI();
        c2.interestRate();
        c2.interestOnRd();
    }
}