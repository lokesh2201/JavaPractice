package Assignments.Assignment1;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the an Number");
        int No = S.nextInt();

        plaindromeNo(No);

        S.close();
    }

    static void plaindromeNo(int N) {
        int originalValue = N;
        int ReverseNo =0;
        int Rem;

        while (N != 0) {
            Rem = N % 10;
            ReverseNo = ReverseNo * 10 + Rem;
            N = N / 10;
        }

        if(originalValue == ReverseNo){
            System.out.println(ReverseNo + " Is an Palindrome Number");
        } else {
            System.out.println(originalValue + " Is an not Palindrome Number");

        }

    }


}
