//PROBLEM LINK https://www.hackerrank.com/challenges/java-loops/problem

import java.util.*;

public class Java_Loops_2 {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int pw=1,ans=a;
            for(int j=0;j<n;j++)
            {
                ans+=pw*b;
                System.out.printf("%d ",ans);
                pw=pw*2;
            }
            System.out.println("");
            
        }
        in.close();
    }
}
