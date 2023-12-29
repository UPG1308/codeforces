import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while(t-- > 0){
        int n = sc.nextInt();
        String s = sc.next();
        StringBuilder str = new StringBuilder();
        
        HashSet<Character> vow = new HashSet<>();
        vow.add('a');
        vow.add('e');
        
        for(int i = 0; i < n; i++){
          char ch = s.charAt(i);
          if(vow.contains(ch)){
            if(i + 2 < n && vow.contains(s.charAt(i + 2))){
              str.append(ch);
              str.append(".");
            }
            else{
              str.append(ch);
            }
          }
          else{
            if(i + 1 < n && !vow.contains(s.charAt(i + 1))){
              str.append(ch);
              str.append(".");
            }
            else{
              str.append(ch);
            }
          }
        }
        System.out.println(str);
      }
  }
}
