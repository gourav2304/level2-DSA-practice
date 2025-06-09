import java.util.Scanner;

public class ReverseWordsSimple {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentences");
        String line = sc.nextLine();
        String[] words = line.split("");

        for(String word : words){
            for(int i = word.length()-1; i>=0; i--){
                System.out.println(word.charAt(i));

            }
            System.out.println(" ");
        }
    }
}