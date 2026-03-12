package Assignment1;

import java.util.Scanner;

public class Areaofcircle {

    public static void main(String[] args){
        Scanner S = new Scanner(System.in);

        double Radius = ReadNumber(S);
        double Area = CircleFormula(Radius);
        System.out.println("Area of Circle = " + Area);

    }

    public static double ReadNumber(Scanner S){
        System.out.println("EnterRadius: ");
        return S.nextDouble();
    }

    public static double CircleFormula(double R){

        double A = Math.PI * R * R;
        return A;
    }
}
