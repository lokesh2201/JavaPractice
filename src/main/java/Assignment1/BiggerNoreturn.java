package Assignment1;

import java.util.Scanner;

public class BiggerNoreturn {

    public static void main(String[] args){

        Scanner S = new Scanner(System.in);

            int N = ReadNumber(S);
            System.out.println(N);
        }

        public static int ReadNumber(Scanner S){
            System.out.println("Enter an Nummber: ");
            return S.nextInt();
        }

    }
}
