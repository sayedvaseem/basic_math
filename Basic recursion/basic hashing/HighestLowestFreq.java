import java.util.*;
public class HighestLowestFreq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int key = arr[i];
            int freq = 0;
            if(map.containsKey(key)) freq = map.get(key);
            freq++;
            map.put(key, freq);
        }
        int maxfreq = 0,minfreq = n;
        int maxele = 0,minele = 0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int count = entry.getValue();
            int element = entry.getKey();

            if(count > maxfreq){
                maxfreq = count;
                maxele = element;
            }
            if(count < minfreq){
                minfreq = count;
                minele = element;
            }
        }
        System.out.println("the hightest frequency element is: " + maxele);
        System.out.println("the lowest frequency element is: " + minele);
    }
}
