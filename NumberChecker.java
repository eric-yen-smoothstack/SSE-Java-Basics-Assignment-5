import java.util.*;
import java.io.*;
interface PerformOp {
 boolean check(int a);
}
public class NumberChecker {
    public static PerformOp isOdd(){
        return n -> (n % 2 != 0)? true:false;
    }
    public static PerformOp isPrime(){
           return a ->{ for (int i = 2; i * i <= a; i++) {
                if (a % i == 0) {
                    return false;
                }
            }
            return true;
               };
    }
    public static PerformOp isPalindrome() {
        return a -> a == Integer.parseInt(new StringBuilder(String.valueOf(a)).reverse().toString()) ? true : false;
    }

     public static boolean checker(PerformOp p, int num) {
  return p.check(num);
 }
    public static void main(String args[]) throws Exception{
        NumberChecker ob = new NumberChecker();
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        PerformOp op;
        boolean ret = false;
  String ans = null;
  while (T--> 0) {
   String s = br.readLine().trim();
   StringTokenizer st = new StringTokenizer(s);
   int ch = Integer.parseInt(st.nextToken());
   int num = Integer.parseInt(st.nextToken());
   if (ch == 1) {
    op = ob.isOdd();
    ret = ob.checker(op, num);
    ans = (ret) ? "ODD" : "EVEN";
   } else if (ch == 2) {
    op = ob.isPrime();
    ret = ob.checker(op, num);
    ans = (ret) ? "PRIME" : "COMPOSITE";
   } else if (ch == 3) {
    op = ob.isPalindrome();
    ret = ob.checker(op, num);
    ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

   }
   System.out.println(ans);
    }
    }
}