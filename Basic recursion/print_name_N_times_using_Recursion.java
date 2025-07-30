
class Printer {
    public void function(int i,String name){
        if(i<=5){
            System.out.println(name);
            function(i+1,name);  
        }
    
    } 
    
}
public class PrintNamesNtimesRecursion {
    public static void main(String[] args) {
        Printer p = new Printer();
        
        String name = "waseem";
        p.function(1,name);
    }
}

