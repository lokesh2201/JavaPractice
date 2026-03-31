package JavaBasics.Array;

import java.util.Arrays;
import java.util.Scanner;

public class OneDArray {

    public static void main(String[] args){
        Scanner Scan = new Scanner(System.in);
        //InputforArray(3);
        //Tables(Scan.nextInt(),5);

        int[] result = ThreeSum(Scan.nextInt(),10, Scan);
        System.out.println(Arrays.toString(result));
    }

    public static void InitalizeArray(){

        int[]a={1,3,4,6,7,9,10};

        for(int i=0; i<a.length; i++){
            if (a[i]%2==0){
                System.out.println(a[i]);
            }

        }
    }

    public static void InputforArray(int Arrayvalue){
        Scanner S = new Scanner(System.in);

        int[]Arr = new int[Arrayvalue];

        for(int i=0; i<Arrayvalue; i++){
            Arr[i] = S.nextInt();
        }
        for (int i=0; i<Arrayvalue; i++) {
            System.out.println(Arr[i]);
        }
        System.out.println(Arrays.toString(Arr));
    }

    public static void Tables(int Arraysize, int TableNo){
        Scanner S = new Scanner(System.in);
        int[]Arr = new int[Arraysize];
        // Getting the Input based on the ArrayValue
        for(int i = 0; i<Arraysize; i++){
            Arr[i] = S.nextInt();
        }
        // Multiplying the input Based on the table No
        for (int i=0; i<Arr.length; i++){
            Arr[i] = TableNo * (i+1);
        }

//
        System.out.println(Arrays.toString(Arr));
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
