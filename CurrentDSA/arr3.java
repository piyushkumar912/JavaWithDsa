//Move zero  using arry at the end


import java.util.*;
public class arr3 {
     public static void main(String[] args) {
      int[] arr= {1,0,2,0,3,2,0};
      int n = arr.length;
      int[] copy = new int[n];
      int j= 0;
      for(int i = 0; i<n; i++){
        if(arr[i] !=0){
          copy[j] = arr[i];
          j++;
        }
      }
      for(int i =0;i<n;i++){
        System.out.print(copy[i] + " ");
      }
    }
}
