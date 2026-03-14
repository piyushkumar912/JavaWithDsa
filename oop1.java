 // --> ENCAPSULATION.
 
 
 import java.util.*;


  class Bank{
    // variables
    private String Name;
    private int AccountNo;
    // getter --> get the value.
   //  setter --> set the value.
   public void setName(String Name){
    this.Name = Name;
   }
   public String getName(){
    return Name;
   }
   public void setAccountNo(int AccountNo){
    this.AccountNo = AccountNo;
   }
   public int getAccountNo(){
    return AccountNo;
   }
}

 public class oop1 {
    public static void main (String[] args) {
        Bank  c1 = new Bank(); // object
        c1.setName("Piyush");
        c1.setAccountNo(99875765);
        System.out.println(c1.getName());
        System.out.println(c1.getAccountNo());
    }
}
