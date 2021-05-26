package HackerRank_Programs;

// import java.io.*;
import java.util.*;

public class Java_String_Reverse {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B="";
        /* Enter your code here. Print output to STDOUT. */
        for(int i=A.length()-1;i>=0;i--)
        {
            B+=A.charAt(i);
        }
        System.out.println((A.compareTo(B))==0 ? "Yes" : "No");
        sc.close();
    }
}



