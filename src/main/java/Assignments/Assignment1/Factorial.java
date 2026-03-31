package Assignments.Assignment1;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner SN = new Scanner(System.in);
        int n = SN.nextInt();

        Factorial(n);
    }

    static void Factorial(int n) {
        int Tot =1;
        for (int i=1; i<=n; i++){
            Tot = Tot * i;
        }
        System.out.println(Tot);
    }
}
