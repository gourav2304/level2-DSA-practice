// public class palindrome {

//     public static void main(String[] args) {
//         String str1 = "MADAM";
//         String str2 = "";

//         for(int i = str1.length()-1; i>=0; i--){
//             str2 = str2+ str1.charAt(i);
//         }
//         if(str1.equals(str2)){
//             System.out.println("given string is palindrome");
//         }else{
//             System.out.println("not palindrome");
//         }
//     }
// }


public class palindrome {

    public static void main(String[] args) {
        String str1 = "MADAm";
    String str2 = "";

    for(int i= str1.length()-1; i>=0; i-- ){
        str2 = str2+ str1.charAt(i);

    }
    if(str1.equals(str2)){
        System.out.println("this is palindrome");
    }else{
        System.out.println("this not palindrome");
    }
    }
}