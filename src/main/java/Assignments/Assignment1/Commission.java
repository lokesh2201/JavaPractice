package Assignments.Assignment1;

import java.util.Scanner;

public class Commission {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int SA = S.nextInt();
        int C = S.nextInt();

        CommissionValue(SA,C);
    }

    static void CommissionValue(int SalesAmt, int Percentage) {
        int Value=0;

        Value = (SalesAmt * Percentage/100);
        System.out.println("My Sales Commission is " + Value + "$");
    }
}
