package Java_Example_Programs;

class Inheritance_1 {
    int x=5;
    void show()
    {
        System.out.println("This is Super class");
    }
}

class B extends Inheritance_1
{
    int y =10;
    void display()
    {
        System.out.println("This is Child Class");
    }

    public static void main(String[] args) {
        Inheritance_1 ob1 = new Inheritance_1();
        ob1.show();
        // ob1.display();               ob1 cannot access methods of B

        Inheritance_1 ob2 = new B();
        ob2.show();
        // ob2.display();               ob2 cannot access methods of B

        // B ob3 = new Inheritance_1();   We cannot create an object in this way

        B ob4 = new B();
        ob4.show();
        ob4.display();

    }
}

