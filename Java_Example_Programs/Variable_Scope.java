package Java_Example_Programs;

public class Variable_Scope {
    int x=5;
    static int Y =10;
    int y=10;
    public static void main(String[] args) {
        Variable_Scope obj1 = new Variable_Scope();
        Variable_Scope obj2 = new Variable_Scope();
        obj1.x = obj1.x+2;
        obj1.y = obj1.y+2;
        System.out.println((obj1.x));
        System.out.println((obj1.y));
        System.out.println(obj2.x);
        System.out.println(obj2.y);
    } 
}