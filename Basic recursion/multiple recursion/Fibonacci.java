class MultipleRecursion{
    int function(int n){
        if(n <= 1) return n;
        int last = function(n-1);
        int slast = function(n-2);
        return last + slast;
    }
}
class Fibonacci {
    public static void main(String[] args) {
        MultipleRecursion mr = new MultipleRecursion();
        System.out.println(mr.function(4));
    }
}
