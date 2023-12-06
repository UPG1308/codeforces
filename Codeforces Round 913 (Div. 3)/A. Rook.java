import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while(t-- > 0){
        String s = sc.next();
        for(int i = 1; i <= 8; i++){
          if(((int)s.charAt(1) - '0') != i){
            System.out.println(s.charAt(0)+""+i);
          }
        }
        for(char c = 'a'; c <= 'h'; c++){
          if(c != s.charAt(0)){
            System.out.println(c+""+s.charAt(1));
          }
        }
      }
  }
}
