
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class  Program4 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    ArrayList arr[] = new ArrayList[n];

    for(int i=0;i<n;i++)
    {
        int size = sc.nextInt();
        arr[i] = new ArrayList();

        for(int j=0;j<size;j++)
        {
            arr[i].add(sc.nextInt());
        }
        
    }


    int q = sc.nextInt();

    for(int i=0;i<q;i++)
    {
        int one = sc.nextInt();
        int two = sc.nextInt();

        try
        {
            System.out.println(arr[one-1].get(two-1));
        }
        catch(Exception e)
        {
            System.out.println("ERROR!");
        }
    }


        sc.close();
    }
}