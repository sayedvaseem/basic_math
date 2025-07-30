class Printer{
    public void function(int i,int n){
        if(i > n) return;
        System.out.println(i);
        function(i+1, n);
    }
}
public class Print_1_to_N_using_Recursion {
    public static void main(String[] args) {
        Printer p = new Printer();
        p.function(1, 5);
    }
}
