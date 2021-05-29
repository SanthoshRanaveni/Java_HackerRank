package Java_Example_Programs;

public class This_keyword_2 {
    int x=5;
    void show()
    {
        int x =10;
        System.out.println(x);
        // "this" keyword explicitly required to access an instance variable
        // whenever both instance variable and local variable are same
        System.out.println(this.x);

    }

    public static void main(String[] args) {
        This_keyword_2 ob = new This_keyword_2();
        ob.show();
    }
}