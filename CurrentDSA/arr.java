public class arr {
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5};
        int n = arr.length;
        //Linear Search 
        int target = 5;
        // traverse 
        boolean check = false; // nhi mila 
        for(int i = 0; i<n; i++){
            if(arr[i] == target){
                check = true; // mil gya
                break;
            }
        }
        System.out.println(check);
    }
}
