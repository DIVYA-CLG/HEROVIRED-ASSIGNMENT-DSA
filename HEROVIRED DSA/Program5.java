import java.util.*;

public class Program5 {

    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        
        while(!q.isEmpty()){
            int i = q.poll();
            
            if(i < 0){
                continue;
            }
            
            if(i>=game.length){
               return true; 
            }
            
            if(game[i] == 1){
                continue;
            }
            
            game[i] = 1;
            q.add(i-1);
            q.add(i+1);
            q.add(i+leap);
        }
        
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        while (q-- > 0) {
            int number = sc.nextInt();
            int leap = sc.nextInt();
            
            int[] game = new int[number];
            for (int i = 0; i < number; i++) {
                game[i] = sc.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        sc.close();
    }
}