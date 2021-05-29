package Java_Example_Programs;

public class This_for_constructor2 {
    This_for_constructor2()
    {   
        this("Parameterized Constructor");
        System.out.println("It is a Default Constructor");
    }
    This_for_constructor2(String s)
    {   
        System.out.println(s);
    }
    public static void main(String[] args) {
        new This_for_constructor2();
    }
}