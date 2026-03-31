package Assignments.ArrayProblems;

import java.util.Scanner;

public class SecondLargestNumber {

    public static void main(String[] args) {

        Scanner S = new Scanner(System.in);

        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = S.nextInt();
        }

        //SecondLargestNo(arr);

        System.out.println(SecondLargestNo(arr));
    }

    static int SecondLargestNo(int[] A) {
        int n = A.length;
        int LargeOne = -1, LargeTwo = -1;

        for (int i = 0; i < n; i++) {
            if (A[i] > LargeOne){
                LargeTwo = LargeOne;
                LargeOne = A[i];
            }
            else if(A[i] < LargeOne && A[i] > LargeTwo) {
                LargeTwo = A[i];
            }
        }
        return LargeTwo;
    }


}
