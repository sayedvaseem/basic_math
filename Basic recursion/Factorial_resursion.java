class FactorialFinder{
    int function(int n){
        if(n == 0) return 1;
        return n*function(n-1);
        
    }
}
public class Factorial_resursion {
    public static void main(String[] args) {
        FactorialFinder f = new FactorialFinder();
        int fact = f.function(5);
        System.out.println(fact);
    }
}
