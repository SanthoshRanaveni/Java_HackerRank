package Java_Example_Programs;

public class This_for_constructor {
    This_for_constructor()
    {
        System.out.println("It is a Default Constructor");
    }
    This_for_constructor(String s)
    {   
        this();
        System.out.println(s);
    }
    public static void main(String[] args) {
        new This_for_constructor("Parameterized Constructor");
    }
}