//find the maximum value using arry


import java.util.*;
public class arr2 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int size = sc.nextInt();
        int[] arr = new int [size];
        for(int i = 0; i<size; i++){
            arr [i] = sc.nextInt();
        }
        //{5,8,7,2,1}
        int max = arr[0];//first element of arr 8
        for(int i = 0; i<size; i++){
            max = Math.max(max, arr[i]);
        }
        System.out.print(max);
    }
}
