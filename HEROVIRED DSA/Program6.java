import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Program6 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int se = sc.nextInt();
        
        List<Integer> source = new ArrayList<>();
        for (int i = 0; i < se; i++) {
            source.add(sc.nextInt());
        }
        
        int queries = sc.nextInt();
        for (int len = 0; len < queries; len++) {
            String query = sc.next();
            
            switch (query) {
                case "Insert":
                    int index = sc.nextInt();
                    int value = sc.nextInt();
                    source.add(index, value);
                    break;
                case "Delete":
                    source.remove(sc.nextInt());
                    break;
            }
        }
        
        for (Integer i : source) {
            System.out.print(i + " ");
        }

        sc.close();
  
    }
}
