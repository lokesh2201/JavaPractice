package Assignments.Assignment1;

import java.util.Scanner;

public class Discount {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int A = S.nextInt();
        int D = S.nextInt();

        ProductDiscount(A,D);

    }

    static void ProductDiscount(int Amount, int Discount) {
        int Value = 0, TotDiscount =0;

        Value = Amount * Discount / 100;
        TotDiscount = Amount - Value;
        System.out.println("Discount amount " + Value);
        System.out.println("Final price " + TotDiscount);
    }
}
