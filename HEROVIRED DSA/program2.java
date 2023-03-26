import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class program2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int array[][] = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                array[i][j] = in.nextInt();
            }
        }
        int result= Integer.MIN_VALUE, sum = 0;
        ;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if ((i + 2 < 6) && (j + 2) < 6) {
                    sum = array[i][j] + array[i][j + 1] + array[i][j + 2] + array[i + 1][j + 1] + array[i + 2][j]
                            + array[i + 2][j + 1] + array[i + 2][j + 2];
                    if (sum > result)
                        result = sum;
                }
            }
        }
        System.out.println(result);
        in.close();
    }
}
