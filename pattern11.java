
package java_patterns; 
public class pattern11 {
    public static void main(String[] args) {
        int space=2*(5-1);
        for(int i=1;i<=5;i++){
            

        for(int j=1;j<=5;j++){
            System.out.print(j);
        }

        for(int j=1;j<=space;j++){
            System.out.print(" ");
        }

        for(int j=i;j>=1;j--){
            System.out.print(j);
        }
        System.out.println();
          space-=2;
    }
    
}}
