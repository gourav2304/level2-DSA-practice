
// import java.util.Scanner;


// public class ReverseWordsSimple {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a sentence: ");
//         String line = sc.nextLine();

//         String[] words = line.split(" ");

//         for (String word : words) {
//             for (int i = word.length() - 1; i >= 0; i--) {
//                 System.out.print(word.charAt(i));
//             }
//             System.out.print(" ");
//         }
//     }
// }

// import java.util.Scanner;

// public class ReverseWordsSimple{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the statement :");
//         String line = sc.nextLine();

//         String[] words = line.split(" ");

//         for(String word : words){
//             for(int i =word.length()-1; i>=0; i--){
//                 System.out.print(word.charAt(i));
//             }
//             System.out.print(" ");

//         }
//     }
// }

// import java.util.Scanner;

// public class ReverseWordsSimple {

//     public static void main(String[] args) {
//         Scanner sc =new Scanner(System.in);
//         System.out.println("enter the statement : ");
//         String line = sc.nextLine();

//         String[] words = line.split(" ");

//         for(String word : words){
//             for(int i =word.length()-1; i>=0; i--){
//                 System.out.print(word.charAt(i));
//             }
//             System.out.print(" ");
//         }
//     }
// }

// import java.util.Scanner;

// public class ReverseWordsSimple {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the sentences");
//         String line = sc.nextLine();
//         String[] words = line.split(" ");

//         for(String word : words){
//             for(int i = word.length()-1; i>=0; i--){
//                 System.out.print(word.charAt(i));

//             }
//             System.out.print(" ");
//         }
//     }
// }

import java.util.Scanner;

public class ReverseWordsSimple {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the stetment :");
        String line = sc.nextLine();
        String [] words = line.split(" ");

        for(String word : words ){
            for(int i = word.length()-1; i>=0 ; i--){
                System.out.print(word.charAt(i));
            }
            System.out.print(" ");
        }
    }
}