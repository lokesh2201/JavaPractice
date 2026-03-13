package JavaBasics.Class;

public class ClassConcept {

    static int a = 10;
    static int b = 5;


    public static void Add(){
        int sum = a+b;
        System.out.println(sum);
    }

    public static void SuB(){
        int sum = a-b;
        System.out.println(sum);
    }

    public static void main(String[] args){
        Add();
        SuB();
    }
}
