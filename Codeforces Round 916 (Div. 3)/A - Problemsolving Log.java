import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while(t-- > 0){
        int n = sc.nextInt();
        String s = sc.next();
        int arr[] = new int[27];
        
        for(char c: s.toCharArray()){
          arr[c - 'A' + 1]++;
        }
        int count = 0;
        for(int i = 1; i < 27; i++){
          if(arr[i] >= i) count++;
        }
        System.out.println(count);
      }
  }
}
