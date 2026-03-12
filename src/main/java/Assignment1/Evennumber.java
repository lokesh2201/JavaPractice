package Assignment1;

import java.util.Scanner;

public class Evennumber {

    public static void main(String[] args){
        Scanner S = new Scanner(System.in);

        int N = ReadNumber(S);
        int NO = CheckNumber(N);
        System.out.println(NO);
    }

    public static int ReadNumber(Scanner S){
        System.out.println("Enter an Nummber: ");
        return S.nextInt();
    }

    public static int CheckNumber(int n){

        if(n%2==0){
            System.out.println("Ev2en Number");
        }else {
            System.out.println("Odd Number");
        }
        return n;
    }
}
