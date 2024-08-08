package java_patterns;
public class pattern8 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            // spaces
            for (int j = 1; j <= 5-i-1; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <=  (2 * i + 1); j++) {
                System.out.print("*");
            }
            for (int j = 1; j < 5-i-1 ; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        
        for (int i = 0; i < 5; i++) {
            // spaces
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= 2*5 - (2 * i + 1); j++) {
                System.out.print("*");
            }
            for (int j = 1; j < i ; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

    }
    
}
