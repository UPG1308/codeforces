import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while(t-- > 0){
        String[] mat = new String[3];
        for(int i = 0;i < 3; i++) mat[i] = sc.next();
        
        boolean a = false, b = false, c = false, flag = false;
        
        for(int i = 0; i < 3; i++){
          a = false; b = false; c = false;
          for(int j = 0; j < 3; j++){
            char ch = mat[i].charAt(j);
            if(ch == 'A') a = true;
            if(ch == 'B') b = true;
            if(ch == 'C') c = true;
            if(ch == '?') flag = true;
          }
          if(flag){
            if(!a){
              System.out.println("A");
              break;
            } 
            else if(!b) {
              System.out.println("B");
              break;
            }
            else {
              System.out.println("C");
              break;
            }
          }
          if(flag) break;
        }
      }
  }
}
