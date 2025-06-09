// File: Main.java

interface Payment {
    void pay(int amount);
}

class UPI implements Payment {
    public void pay(int amount) {
        System.out.println("Payment with UPI: " + amount);
    }
}

class Creditcard implements Payment {
    public void pay(int amount) {
        System.out.println("Payment with Credit Card: " + amount);
    }
}

public class Main {
    public static void main(String[] args) {
        Payment p = new UPI();           // Polymorphism
        p.pay(500);                      // Output: Payment with UPI: 500

        p = new Creditcard();            // Reassigning to another implementation
        p.pay(1000);                     // Output: Payment with Credit Card: 1000
    }
}
