public class printandskip {
    public static void main(String[] args) {
        
        int index = 1; 
        for(int i = 101; i<= 150; i++){
            int tens = (i/10)%10;
            int unit = i%10;

             if (tens == unit) {
                System.out.println("Skipped at index " + index + ": " + i);
            } 

            index++;
            System.out.println(i+ " ");
        }
    }
    
}
