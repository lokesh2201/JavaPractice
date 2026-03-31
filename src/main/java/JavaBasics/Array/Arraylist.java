package JavaBasics.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {

    public static void main(String[] args) {

        ArrayList <Integer> LST = new ArrayList<>(10);

        Scanner IN = new Scanner(System.in);

        for (int i=0; i<5; i++) {
            LST.add(IN.nextInt());
        }

        for (int i=0; i<5; i++) {
            System.out.print(LST.get(i) + " ");
        }
        System.out.println();

        LST.set(4,1000);

        System.out.println(LST);

    }
}
