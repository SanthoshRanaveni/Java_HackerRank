package HackerRank_Programs;

// import java.io.*;
import java.util.*;
// import java.text.*;
// import java.math.*;
// import java.util.regex.*;

public class Java_HashSet {

 public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

//Write your code here
        HashSet<String> hs = new HashSet<>();
        for(int j=0;j<t;j++){
            String str = pair_left[j]+" "+pair_right[j];
            String strRev = pair_right[j]+" "+pair_left[j];
            if(!hs.contains(str) || !hs.contains(strRev))
                hs.add(str);
            System.out.println(hs.size());
        }
        s.close();

    }
}