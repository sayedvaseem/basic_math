class Printer{
    public void function(int i,int n){
        if(i<1) return;
        function(i-1, n);
        System.out.println(i);
    }
} 
public class One_to_N_backtracking  {
    public static void main(String[] args) {
        int n = 5;
        Printer p = new Printer();
        p.function(n, n);
    }
}
