package HackerRank_Programs;

// import java.io.*;
import java.util.*;

public class Java_List {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<Integer>();
        for(int i =0;i<n;i++)
        {
            arr.add(sc.nextInt());
        }
        int t = sc.nextInt();
        while(t>0)
        {
            String qry= sc.next();
            switch(qry){
                case "Insert": int idx = sc.nextInt();
                                int num = sc.nextInt();
                                arr.add(idx,num);
                                break;
                case "Delete": int idxx = sc.nextInt();
                                arr.remove(idxx);
                                break;
            }
            t--;
        }
        for(Integer k : arr){
            System.out.print(k+" ");
        }
        sc.close();
    }
    
}
