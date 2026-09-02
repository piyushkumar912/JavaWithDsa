// --> ENCAPSULATION IN JAVA . Example--> 

import java.util.*;
public class oop2 {
    public static void main(String[] args) {
        customerDetails c1 = new customerDetails();
        c1.setName("Piyush");
        c1.setAge(20);
        c1.setGender("Male");
        System.out.println(c1.getName());
        System.out.println(c1.getAge());
        System.out.println(c1.getGender());
    }
}

class customerDetails{
    private String  Name;
    private int Age;
    private String Gender;
    public void setName(String Name){ // getter & setter
      this.Name = Name;
    }
    public  String getName(){
        return Name;
    }
    public  void setAge(int Age){
        this.Age = Age;
    }
    public  int getAge(){
        return Age;
    }
    public  void setGender(String Gender){
        this.Gender = Gender;
    }
    public  String getGender(){
        return Gender;
    }

    }
