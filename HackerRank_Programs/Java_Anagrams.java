package HackerRank_Programs;

import java.util.Scanner;

public class Java_Anagrams {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        int[] al = new int[26];
        
        for(int i=0;i<a.length();i++)
        {
            al[((int)Character.toUpperCase(a.charAt(i)))-65]+=1;
        }
        for(int i=0;i<b.length();i++)
        {
            al[((int)Character.toUpperCase(b.charAt(i)))-65]-=1;
        }
        for(int i=0;i<26;i++){
            if(al[i]!=0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
            
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}