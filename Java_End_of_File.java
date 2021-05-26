//Problem Link https://www.hackerrank.com/challenges/java-end-of-file/problem
import java.util.*;
public class Java_End_of_File {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int i=1;
        while(sc.hasNext())
        {
            String st=sc.nextLine();
            System.out.println(i+" "+st);
            i++;
        }
        sc.close();
    }
}