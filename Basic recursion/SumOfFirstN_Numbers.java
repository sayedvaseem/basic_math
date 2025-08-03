class Parameterized{
    void function(int i,int sum){
        if(i <1) {
            System.out.println(sum);
            return;
        }
        function(i-1, sum + i);
    }
}
class Functional{
    public int  function(int n){
        if(n==0) return 0;
        return n + function(n-1);

    }
}
public class SumOfFirstN_Numbers {
    public static void main(String[] args) {
        Parameterized p = new Parameterized();
        Functional f= new Functional();
        p.function(5, 0);
        int result = f.function(5);
        System.out.println(result);
    }
}
