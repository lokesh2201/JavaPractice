package Assignments.Assignment1;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the Principal Amount");
        double PrincipalAmount = S.nextDouble();
        System.out.println("Enter the Interest Rate");
        double InterestRate = S.nextDouble();
        System.out.println("Enter the No.of Times Interest");
        double N = S.nextDouble();
        System.out.println("Enter No of years");
        double Years = S.nextDouble();

        CompoundINT(PrincipalAmount, InterestRate,N, Years);

        S.close();
    }

    static void CompoundINT(double principalAmount, double interestRate, double n, double years) {
        double FinalValue =0, compoundValue=0;
        double DecimalRate = interestRate/100;

         FinalValue = principalAmount * Math.pow((1 + DecimalRate/n),(n * years));
         compoundValue = FinalValue - principalAmount;
        System.out.println(" The Total amount = " + FinalValue);
        System.out.println(" The Total interest earned = " + compoundValue);
    }


}
