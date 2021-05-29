package Java_Example_Programs;

class Super {
    int x=5;
}

class Sub extends Super{

    int x=10;
    void display()
    {
        int x = 15;
        System.out.println(x);
        System.out.println(this.x);
        System.out.println(super.x);
    }

    public static void main(String[] args) {
        Sub ob = new Sub();
        ob.display();
    }
}