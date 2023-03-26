import java.util.Scanner;

public class Program15
 {
public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        largest = s.substring(0,k);
        smallest = s.substring(0,k);
        
        for(int i =0;i<=s.length()-k;i++)
        {
            if(largest.compareTo(s.substring(i,k+i))<0)
            largest=s.substring(i,k+i);
            
            if(smallest.compareTo(s.substring(i,k+i))>0)
            smallest=s.substring(i,k+i);
        }
        return smallest + "\n" + largest;
    }




    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}