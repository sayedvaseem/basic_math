import java.util.*;
class Main{
    public void printer(int[] nums){
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int flag = 0;
        int end =0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            if(sum > max) {
                end = i;
                max = sum;
            }
            if(sum < 0){
                sum = 0;
                flag = i+1;
            }
        }
        System.out.println(max);
        for(int i =flag;i<=end;i++) System.out.print(nums[i] + " ");
    }
}


public class Kadane_Algorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] arr = { -2,1,-3,4,-1,2,1,-5,4};
        Main m = new Main();
        m.printer(arr);
    }
}
