package Java_Example_Programs;

public class This_keyword
{   
    int x =5;
    void show()
    {
        System.out.println(x);   //  Implicitly System.out.println(this.x);
    }

    public static void main(String[] args) {
        This_keyword ob1 = new This_keyword();   
        This_keyword ob2 = new This_keyword();   

        ob1.x+=3;
        ob1.show();  
        ob2.show();
    }
}