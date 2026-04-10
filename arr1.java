import java.util.*;

public class arr1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int [size];
        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        boolean check = false;
        for(int i = 0; i<size; i++){
            if(arr[i] == target){
                check = true;
                break;
            }
        }
        System.out.println(check);
    }
}
  