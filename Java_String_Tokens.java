// import java.io.*;
import java.util.*;

public class Java_String_Tokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        s=s.trim();
        if(s.length()>0)
        {
            String[] sl = s.split("[ ._',@?!]+");
            System.out.println(sl.length);
            for(String str :sl)
            {
                System.out.println(str);
            }
        }
        else
            System.out.println("0");
        scan.close();
    }
}

