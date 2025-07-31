class Printer{
    public void function(int i, int n){
        if(i>n) return;
        function(i+1, n);
        System.out.println(i);
    }
}

public class N_to_1_backtracking {
    public static void main(String[] args) {
        Printer p = new Printer();
        p.function(1, 5);
    }
}
