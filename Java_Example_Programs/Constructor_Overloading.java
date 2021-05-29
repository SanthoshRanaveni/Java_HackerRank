package Java_Example_Programs;

//An example of Constructor Overloading
public class Constructor_Overloading {
    Constructor_Overloading()
    {
        System.out.println("Default Constructor");
    }

    Constructor_Overloading(String s)
    {
        System.out.println("Parameterized Constructor");
        System.out.println(s);
    }

    public static void main(String[] args) {
        new Constructor_Overloading();
        new Constructor_Overloading("Santhosh Kumar Ranaveni");
    }
}