// import java.util.Scanner;

public class Java_Substring_Comparisons {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        String[] al = new String[s.length()-k+1];
        for(int i=0;i<=s.length()-k;i++)
        {
            String sub = s.substring(i,i+k);
            al[i]=sub;
        }
        smallest = s.substring(0,k);
        largest = s.substring(0,k);
        for(String sr :al){
            if(sr.compareTo(smallest)<0)
                smallest=sr;
            if(sr.compareTo(largest)>0)
                largest=sr;
        }
        
        return smallest + "\n" + largest;
    }
}

