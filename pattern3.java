
package java_patterns;
public class pattern3 {

    static void star_print() {
      
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < i + 1; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

     star_print();

    }
}