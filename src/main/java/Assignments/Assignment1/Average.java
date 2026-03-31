package Assignments.Assignment1;

import java.util.Scanner;

public class Average {

    public static void main(String[] args) {
        Scanner SN = new Scanner(System.in);
        int N = SN.nextInt();

        AverageNO(N, SN);


    }

    static void AverageNO(int ArraySize, Scanner S) {
        int[]ARR = new int[ArraySize];
        int Tot = 0;
        double AVG = 0;

        for(int i = 0; i<ARR.length; i++){
            ARR[i] = S.nextInt();
        }
        for (int i=0; i<ARR.length; i++){
            Tot = ARR[i] + Tot;
            AVG = Tot/ARR.length;
            }
            System.out.println(Tot);
            System.out.println(Tot);
        System.out.println(AVG);
    }


}
