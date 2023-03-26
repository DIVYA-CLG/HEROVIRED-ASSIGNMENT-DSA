import java.util.*;

public class program1 {

    public static void main(String[] args) {
	   
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

    int[] array = new int[n];
    for(int i = 0; i < n; i++){
        array[i]=scan.nextInt();
    }
        scan.close();

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}