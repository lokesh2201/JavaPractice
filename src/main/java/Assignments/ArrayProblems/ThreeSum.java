package Assignments.ArrayProblems;

import java.util.Arrays;
import java.util.Scanner;

public class ThreeSum {

    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        int[] result = ThreeSum(Scan.nextInt(), 10, Scan);
        System.out.println(Arrays.toString(result));
    }


    public static int[] ThreeSum(int Arraysize, int target, Scanner S){
        int[]Arr = new int[Arraysize];
        // Getting the Input based on the Arraysize
        for(int i = 0; i<Arraysize; i++){
            Arr[i] = S.nextInt();
        }

        for(int i=0; i<Arr.length; i++){
            for(int j=i+1; j<Arr.length; j++){
                for(int k=j+1; k<Arr.length; k++){
                    if (Arr[i] + Arr[j] + Arr[k] == target){
                        return new int[]{i,j,k};
                    }
                }
            }
        }

        return new int[]{};
    }
}
