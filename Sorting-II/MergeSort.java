import java.util.*;
class Main{
    public void mergeSort(int arr[] ,int low,int high){
        if(low >= high) return;
        int mid = (low + high)/2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }
    public void merge(int arr[],int low,int mid,int high){
        int[] temp = new int[high - low +1];
        int left = low;
        int right = mid+1;
        int i=0;
        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                temp[i] = arr[left];
                left++;
                i++;
            }
            else{
                temp[i] = arr[right];
                right++;
                i++;
            }
        }
        while(left <= mid){
            temp[i] = arr[left];
            left++;
            i++;
        }
        while(right <= high){
            temp[i] = arr[right];
            right++;
            i++;
        }
        for(int j=low;j<= high;j++){
            arr[j] = temp[j - low];
        }
    }
}

public class MergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Main m = new Main();
        m.mergeSort(arr,0,n-1);
        for(int i=0;i<n;i++) System.out.print(arr[i] + " ");
    }
}

