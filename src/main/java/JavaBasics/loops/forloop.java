package JavaBasics.loops;
import java.util.Scanner;

public class forloop {

    public static void main(String[] args){
        int N = ReadNumber();
        ForLoop(N);
    }

    public static int ReadNumber(){
        Scanner S = new Scanner(System.in);
        return S.nextInt();
    }
    public static void ForLoop(int n){

        /* Sandglass
        for (int i=1; i<n; i++){ // Rows
            for (int j=1; j<=i; j++){ // Columns
                System.out.print(" ");
            }
            for (int j=i; j<=n; j++){ // Columns
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i=1; i<=n; i++){ // Rows
            for (int j=i; j<=n; j++){ // Columns
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){ // Columns
                System.out.print("* ");
            }
            System.out.println();
        }*/
        /* Diamond
        for (int i=1; i<n; i++){ // Rows
            for (int j=i; j<=n; j++){ // Columns
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){ // Columns
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i=1; i<=n; i++){ // Rows
            for (int j=1; j<=i; j++){ // Columns
                System.out.print(" ");
            }
            for (int j=i; j<=n; j++){ // Columns
                System.out.print("* ");
            }
            System.out.println();
        }*/
        /* Double Hill
        for (int i=1; i<=n; i++){ // Rows
            for (int j=i; j<=n; j++){ // Columns
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){ // Columns
                System.out.print("* ");
            }
            for (int j=i; j<n; j++){ // Columns
                System.out.print("  ");
            }

            for (int j=1; j<=i; j++){ // Columns
                System.out.print("* ");
            }
            System.out.println();
        }*/

        /* ButterFly */
        //Upperpart
        for (int i=1; i<n; i++) { // Rows
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for (int j=i; j<n; j++){
                System.out.print(" ");
            }
            for (int j=i; j<n; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //Lowerpart
        for (int i=n; i>=1; i--) { // Rows
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            for (int j=i; j<n; j++){
                System.out.print(" ");
            }
            for (int j=i; j<n; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
