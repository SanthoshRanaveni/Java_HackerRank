package Java_Example_Programs;

class Super_imp 
{
    Super_imp()
    {
        this("Captain America");                      // 4)
        System.out.println("Iron Man");               // 6) print Iron Man
    }    
    Super_imp(String s)
    {
        System.out.println(s);                        // 5) print Captain America
    }   
}

class SubClass extends Super_imp
{
    SubClass()
    {                                                // 3)implicit super()
        System.out.println("Hulk");                  // 7) Print Hulk
    }
    SubClass(String s)
    {
        this();                                      //2
        System.out.println(s);                       // 8) print Thor
    }
    public static void main(String[] args) {
        new SubClass("Thor");                        //1
    }

}