class Printer{
    public void function(int n){
        if(n == 0) return;
        System.out.println(n);
        function(n-=1);
    }
}
public class Print_N_to_1_using_Recursion {
    public static void main(String[] args) {
        Printer p = new Printer();
        p.function(5);
    }
}
