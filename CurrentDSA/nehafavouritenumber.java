import java.io.*;
import java.util.*;

public class nehafavouritenumber {

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int count =0;
        for(int i = 1; i<=n; i = i+1){
            if(n % i ==0){
                count = count + 1;
            }
        }
        if(count == 2){
            System.out.println("Neha is Happy");
        }
        else{
            System.out.println("Neha is Sad");
        }
     }
    }