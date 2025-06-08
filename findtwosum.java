// public class findtwosum {
    
//     public static void twoSum(int []arr, int target){
//         for(int i = 0 ; i< arr.length; i++){
//             for(int j = 0 ; j < arr.length ; j++){
//                 if(arr[i]+ arr[j] == target){
//                     System.out.println("print" + arr[i] + "+" + arr[j] + "="+ target);
//                     return;
//                 }
//             }
//         }
//     }

//     public static void main(String[] args) {
//         int [] arr = {1,7,8,6,7,5};
//         int target = 9;

//         twoSum(arr, target);
//     }
// }


public class findtwosum{

    public static void twosum(int[]arr, int target){
        for(int i = 0 ; i< arr.length ; i++){
            for(int j =0 ; j< arr.length; j++){
                if(arr[i]+ arr[j]== target){
                    System.out.println("print :"+ arr[i] + "+" + arr[j] + "=" + target );
                    System.out.println(" at index : " + i + " " +j );
                }
            }
        }
    }
    public static void main(String[] args) {
        int []arr = {2,3,4,5,6,9};
        int target= 9;
         twosum(arr, target);
    }
}



// public class findtwosum{
//     public static void twosum(int[]arr,int target){
//         for(int i =0 ; i<arr.length;i++){
//             for(int j=0 ; j<arr.length; j++){
//                 if(arr[i] + arr[j]== target){
//                     System.out.println("no are :"+ " " + arr[i] + " " + "+" +  " " + arr[j]+ "=" + target);
//                     System.out.println("index :" + i + " " + j + " ");
//                 }
//             }
//         }

//     }
//     public static void main(String[] args) {
//         int[]arr = {2,3,4,5,6,9};
//         int target = 7;
     
//         twosum(arr,target);
        

//     }
// }