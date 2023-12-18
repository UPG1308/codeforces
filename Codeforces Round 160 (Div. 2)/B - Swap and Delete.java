import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while(t-- > 0){
        String s = sc.next();
        int ones = 0, zeros = 0;
        for(char c: s.toCharArray()){
          if(c == '0') zeros++;
          else ones++;
        }
        if(zeros == ones){
          System.out.println("0");
          continue;
        }
        for(int i = 0; i < s.length(); i++){
          char c = s.charAt(i);
          if(c == '0'){
            if(ones > 0) ones--;
            else{
              System.out.println(s.length() - i);
              break;
            }
          }
          else {
            if(zeros > 0) zeros--;
            else{
              System.out.println(s.length() - i);
              break;
            }
          }
        }
      }
  }
}
