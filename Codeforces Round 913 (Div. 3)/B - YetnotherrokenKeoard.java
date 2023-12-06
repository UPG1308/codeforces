import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while(t-- > 0){
        String s = sc.next();
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        int b = 0, B = 0;
        for(int i = n - 1; i >= 0; i--){
          char ch = s.charAt(i);
          if(ch == 'b'){
            b++;
            continue;
          }
          else if(ch == 'B'){
            B++;
            continue;
          }
          if(Character.isLowerCase(ch) && ch != 'b' && b == 0) sb.append(ch);
          else if(Character.isUpperCase(ch) && ch != 'B' && B == 0) sb.append(ch);
          else if(Character.isUpperCase(ch) && ch != 'B' && B > 0) B--;
          else if(Character.isLowerCase(ch) && ch != 'b' && b > 0)b--;
          
        }
        System.out.println(sb.reverse().toString());
      }
  }
}
