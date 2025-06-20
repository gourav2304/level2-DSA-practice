public class pattern {
    
    public static void main(String[] args) {
        int n =3;
        for (int i = 1; i <= 6; i++) {
            if (i == 1) {
                // Line 1: k k * * * * *
                System.out.print("    ");
                for (int j = 0; j < n+2; j++) {
                    System.out.print("* ");
                }
            } else if (i == 2) {
                // Line 2: K k *
                System.out.print("    *");
            } else if (i == 3) {
                // Line 4: k k * * * *
                System.out.print("    ");
                for (int j = 0; j < n +1; j++) {
                    System.out.print("* ");
                }
            } else if (i == 4) {
                // Line 5: k k *
                System.out.print("    *");
            } else if (i == 5) {
                // Line 6: * * *
                for (int j = 0; j <= n-1; j++) {
                    System.out.print("* ");
                }
            }
            System.out.println(); // move to next line
        }
    }


}
