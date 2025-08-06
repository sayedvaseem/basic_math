class Checker{
  public boolean function(int i,String s){
    int n = s.length();
    if(i >= n/2) return true;
    if(s.charAt(i) != s.charAt(n-i-1)) return false;
    return function(i + 1,s);
  }
}
public class PalindromeRecursion{
  public static void main(String[] args){
    Checker c = new Checker();
    String s = "waseem";
    System.out.println( c.function(0,s));
  }
}
