public class findtwosum {
    
    public static void twoSum(int []arr, int target){
        for(int i = 0 ; i< arr.length; i++){
            for(int j = 0 ; j < arr.length ; j++){
                if(arr[i]+ arr[j] == target){
                    System.out.println("print" + arr[i] + "+" + arr[j] + "="+ target);
                    return;
                }
            }
        }
    }

    public static void main(String[] args) {
        int [] arr = {1,7,8,6,7,5};
        int target = 9;

        twoSum(arr, target);
    }
}
