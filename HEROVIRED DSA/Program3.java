import java.io.*;
import java.util.*;

public class Program3 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner sc=new Scanner(System.in);
    int number=sc.nextInt();
    int[] arr= new int[number];
    for(int i=0;i<number;i++){
        arr[i]=sc.nextInt();
    }
    int count=0;
    for(int i=0;i<number;i++){
        int sum=0;
        for(int j=i;j<number;j++){
            sum=arr[j]+sum;
            if(sum<0){
                count++;
            }
        }
    }
    System.out.println(count);
    }
}
