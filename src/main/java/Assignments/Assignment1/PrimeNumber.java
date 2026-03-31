package Assignments.Assignment1;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner SN = new Scanner(System.in);
        int n = SN.nextInt();
        PrimeNo(n);

    }

    static void PrimeNo(int N) {
        if(N%1==0 && N%N==0){
            System.out.println("This is a prime number " + N);
        }else {
            System.out.println("This is not an prime number " + N);
        }
    }

}
