package Assignments.Assignment1;

import java.util.Scanner;

public class CelsiusToFahrenheit {

    public static void main(String[] args){
        Scanner S = new Scanner(System.in);

        int Celsius = ReadNumber(S);
        int Fahrenheit  = ConvertFahrenheit(Celsius);
        System.out.println(Fahrenheit);
    }

    public static int ReadNumber(Scanner S){
        System.out.println("Enter the Celsius: ");
        return S.nextInt();
    }

    public static int ConvertFahrenheit(int n){

        int F = (n * 9 / 5) + 32;
        return F;
    }
}
