package Assignments.ArrayProblems;

import java.util.Scanner;

public class LargestNumber {

    public static void main(String[] args) {

        Scanner S = new Scanner(System.in);
        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = S.nextInt();
        }

        System.out.println(LargestNo(arr));
    }

    static int LargestNo(int[] A) {
        int n = A.length;
        int LargeNo = 0;

        for (int i = 0; i < n; i++) {
            if (A[i] > LargeNo){
                LargeNo = A[i];
            }
        }
        return LargeNo;
    }

}
