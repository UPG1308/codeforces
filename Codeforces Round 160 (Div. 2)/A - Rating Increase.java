import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while(t-- > 0){
        String s = sc.next();
        int i = 0;
        for(i = 1; i < s.length(); i++){
          if(s.charAt(i) != '0') break;
        }
        if(i == s.length()){
          System.out.println("-1");
          continue;
        }
        int val1 = Integer.valueOf(s.substring(0, i));
        int val2 = Integer.valueOf(s.substring(i, s.length()));
        if(val1 < val2){
          System.out.println(val1 +" "+val2);
        }
        else System.out.println("-1");
      }
  }
}
