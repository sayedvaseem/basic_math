import java.util.*;
public class FrequencyOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int q = sc.nextInt();
        int[] hash = new int[13];
        for(int i =0;i<n;i++){
            hash[arr[i]] += 1;
        }
        for(int i=0;i<q;i++){
            int number = sc.nextInt();
            System.out.println(hash[number]);
        }
    }
}

