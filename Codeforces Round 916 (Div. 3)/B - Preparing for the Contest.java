import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while(t-- > 0){
        int n = sc.nextInt();
        int k = sc.nextInt();
        int i = 1;
        for(i = 1; i <= k; i++){
          System.out.print(i+" ");
        }
        int j = n;
        while(j >= i){
          System.out.print(j+" ");
          j--;
        }
        System.out.println();
      }
  }
}
