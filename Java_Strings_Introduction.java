// import java.io.*;
import java.util.*;

public class Java_Strings_Introduction {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length()+B.length());
        System.out.println(((A.compareTo(B))>0) ? "Yes" : "No"  );
        // String res = A.charAt(0).toUpper() + A.subString(1,A.length()-1) + B.charAt(0).toUpper() + B.subString(1,B.length()-1);
        System.out.println(Character.toUpperCase(A.charAt(0)) + A.substring(1,A.length())+" "+Character.toUpperCase(B.charAt(0))+B.substring(1,B.length()));
        sc.close();
    }
}



