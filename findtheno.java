public class findtheno {
    public static void find(int []arr, int target){

        for(int i = 0 ; i<arr.length; i++){
            if(arr[i]==target){
                System.out.println("index " + i);
            }
        }


    }
    public static void main (String[]arg){
        int []arr = {1,2,3,4,6,8,5,8};
        int target = 4;
        find(arr , target);
    }
    
}
