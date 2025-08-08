import java.util.*;
public class CharacterHashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int[] hash = new int[26];

        for(int i = 0;i<s.length();i++){
            hash[s.charAt(i) - 'a'] += 1;
        }


        int q = sc.nextInt();
        for(int i=0;i<q;i++){
            char c = sc.next().charAt(0);
            System.out.println(hash[c - 'a']);
        }
    }
}

