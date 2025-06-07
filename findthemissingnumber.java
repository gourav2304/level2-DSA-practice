// public class findthemissingnumber{
//     public static int findTheMissingNumber(int []arr){
//         int n = arr.length;
//         int total = (n+1)*(n+2)/2;

//         for(int num : arr){
//             total -= num ;
//         }
//         return total;

//     }

//     public static void main(String[] args){
//         int []arr = { 1,2,3,5,6,7,8};
//         int missing = findTheMissingNumber(arr);

//         System.out.println("the missing numvber "+ missing);
//     }
// }


public class findthemissingnumber{
    public static int findTheMissingNumber(int[] arr){
        int n = arr.length;
        int total = (n+1)*(n+2)/2;
        
        for(int num  : arr){
            total -= num;
        }
        return total;

    }

    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,7};
        int missing = findTheMissingNumber(arr);
        System.out.println("the missing number is :" + missing);
    }
}