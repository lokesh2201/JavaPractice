package Assignments.Assignment1;

import java.util.Scanner;

public class Depreciation  {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the Cost of the Product");
        int Cost = S.nextInt();
        System.out.println("Enter the Salvage Value of the Product");
        int Salvage_Value = S.nextInt();
        System.out.println("Enter the Life of Usage");
        int Years = S.nextInt();

        AssetDepriciation(Cost, Salvage_Value, Years);
    }

    static void AssetDepriciation(int Cost, int Salvage, int Years) {
        int Total=0;
        Total = (Cost - Salvage) / Years;
        System.out.println(Total);
    }
}
