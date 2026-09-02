//finding second largest number by in the four given number

import java.util.*;
public class fourgaintsnumerica {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();
    int smax = 0;
    int max = Math.max(Math.max(Math.max(a,b),c),d);
    int min = Math.min(Math.min(Math.min(a,b),c),d);
    if(a!=max && a!=min){
        smax = Math.max(smax,a);
    }
    if(b!=max && b!=min){
        smax = Math.max(smax,b);
    }
    if(c!=max && c!=min){
        smax = Math.max(smax,c);
    }
    if(d!=max && d!=min){
        smax = Math.max(smax,d);
    }
    System.out.println(smax);
}
}
