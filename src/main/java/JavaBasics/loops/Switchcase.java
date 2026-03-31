package JavaBasics.loops;

import java.util.Scanner;

public class Switchcase {

    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        calculator(S.nextInt(),S.nextInt(),S.nextInt());
    }
    public static void calculator(int N, int A, int B){
        int Sum;
        switch(N) {
            case 1: {
                Sum = A + B;
                System.out.println("Addition Value = " + Sum);
                break;
            }
            case 2: {
                Sum = A - B;
                System.out.println("Subraction Value = " + Sum);
                break;
            }
            case 3: {
                Sum = A * B;
                System.out.println("Multiplication Value = " + Sum);
                break;
            }
            default:{
                System.out.println("Case Not Available");
            }
        }
    }
}